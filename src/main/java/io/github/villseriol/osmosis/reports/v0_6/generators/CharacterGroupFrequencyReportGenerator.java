// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.generators;

import java.io.IOException;
import java.lang.Character.UnicodeBlock;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.openstreetmap.osmosis.core.domain.v0_6.Entity;
import org.openstreetmap.osmosis.core.domain.v0_6.Tag;

import io.github.villseriol.osmosis.reports.v0_6.config.ReportFormat;
import io.github.villseriol.osmosis.reports.v0_6.config.UnicodeRange;
import io.github.villseriol.osmosis.reports.v0_6.models.CharacterGroupFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.reports.CharacterGroupFrequencyReportCsv;
import io.github.villseriol.osmosis.reports.v0_6.reports.CharacterGroupFrequencyReportJson;
import io.github.villseriol.osmosis.reports.v0_6.reports.CharacterGroupFrequencyReportYaml;
import io.github.villseriol.osmosis.reports.v0_6.shared.ReportGenerator;


public class CharacterGroupFrequencyReportGenerator extends ReportGenerator {
    private final Map<UnicodeBlock, Long> occurrences = new HashMap<>();

    private final ReportFormat format;

    private final Set<String> tagWhitelist;

    public CharacterGroupFrequencyReportGenerator(final ReportFormat format, final Set<String> tagWhitelist,
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

                UnicodeBlock block = UnicodeBlock.of(codePoint);

                if (block != null) {
                    occurrences.putIfAbsent(block, 0L);
                }
            }
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(Entity entity) {
        Map<UnicodeBlock, Boolean> visited = new HashMap<>();

        for (Tag tag : entity.getTags()) {
            if (!tagWhitelist.contains(tag.getKey())) {
                continue;
            }

            Map<UnicodeBlock, Boolean> blocks = tag.getValue().codePoints().mapToObj(UnicodeBlock::of)
                    .filter(Objects::nonNull).distinct().collect(Collectors.toMap(block -> block, block -> true));

            blocks.forEach((block, present) -> visited.merge(block, present,
                    (left, right) -> Boolean.TRUE.equals(left) || Boolean.TRUE.equals(right)));
        }

        visited.forEach((block, present) -> {
            if (Boolean.TRUE.equals(present)) {
                occurrences.merge(block, 1L, (left, right) -> left.longValue() + right.longValue());
            }
        });
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void generate() throws IOException {
        CharacterGroupFrequencyReportModel model = new CharacterGroupFrequencyReportModel();
        model.setOccurrences(occurrences);

        switch (format) {
        case CSV:
            new CharacterGroupFrequencyReportCsv(model).save(getOutputPath());
            break;

        case YAML:
            new CharacterGroupFrequencyReportYaml(model).save(getOutputPath());
            break;

        case JSON:
            new CharacterGroupFrequencyReportJson(model).save(getOutputPath());
            break;

        default:
            throw new IllegalStateException("Unsupported report format: " + format);
        }
    }

}
