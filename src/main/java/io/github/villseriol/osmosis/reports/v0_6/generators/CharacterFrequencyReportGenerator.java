// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.generators;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openstreetmap.osmosis.core.domain.v0_6.Entity;
import org.openstreetmap.osmosis.core.domain.v0_6.Tag;

import io.github.villseriol.osmosis.reports.v0_6.config.ReportFormat;
import io.github.villseriol.osmosis.reports.v0_6.config.UnicodeRange;
import io.github.villseriol.osmosis.reports.v0_6.models.CharacterFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.reports.CharacterFrequencyReportCsv;
import io.github.villseriol.osmosis.reports.v0_6.reports.CharacterFrequencyReportYaml;
import io.github.villseriol.osmosis.reports.v0_6.shared.ReportGenerator;


public class CharacterFrequencyReportGenerator extends ReportGenerator {
    private final Map<Integer, Long> occurrences = new HashMap<>();

    private final ReportFormat format;

    private final Set<String> tagWhitelist;

    public CharacterFrequencyReportGenerator(final ReportFormat format, final Set<String> tagWhitelist,
            final String outputPath) {
        super(outputPath);

        this.format = format;
        this.tagWhitelist = tagWhitelist;

        for (UnicodeRange range : UnicodeRange.values()) {
            int lower = Math.max(range.getLower(), 0);
            int upper = Math.min(range.getUpper(), Character.MAX_CODE_POINT);

            for (int codePoint = lower; codePoint <= upper; codePoint++) {
                if (codePoint >= Character.MIN_SURROGATE && codePoint <= Character.MAX_SURROGATE) {
                    continue;
                }

                if (Character.isDefined(codePoint)) {
                    occurrences.putIfAbsent(codePoint, 0L);
                }
            }
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(Entity entity) {
        Set<Integer> visited = new HashSet<>();

        for (Tag tag : entity.getTags()) {
            if (!tagWhitelist.contains(tag.getKey())) {
                continue;
            }

            tag.getValue().codePoints().filter(Character::isDefined).forEach(visited::add);
        }

        visited.forEach(
                codePoint -> occurrences.merge(codePoint, 1L, (left, right) -> left.longValue() + right.longValue()));
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void generate() throws IOException {
        CharacterFrequencyReportModel model = new CharacterFrequencyReportModel();
        model.setOccurrences(occurrences);

        switch (format) {
        case CSV:
            new CharacterFrequencyReportCsv(model).save(getOutputPath());
            break;

        case YAML:
            new CharacterFrequencyReportYaml(model).save(getOutputPath());
            break;

        default:
            throw new IllegalStateException("Unsupported report format: " + format);
        }
    }

}
