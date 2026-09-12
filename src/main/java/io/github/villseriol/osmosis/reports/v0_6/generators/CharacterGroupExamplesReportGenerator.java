// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.generators;

import java.io.IOException;
import java.lang.Character.UnicodeBlock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openstreetmap.osmosis.core.domain.v0_6.Entity;
import org.openstreetmap.osmosis.core.domain.v0_6.Tag;

import io.github.villseriol.osmosis.reports.v0_6.config.ReportFormat;
import io.github.villseriol.osmosis.reports.v0_6.models.CharacterGroupExamplesReportModel;
import io.github.villseriol.osmosis.reports.v0_6.reports.CharacterGroupExamplesReportCsv;
import io.github.villseriol.osmosis.reports.v0_6.reports.CharacterGroupExamplesReportJson;
import io.github.villseriol.osmosis.reports.v0_6.reports.CharacterGroupExamplesReportYaml;
import io.github.villseriol.osmosis.reports.v0_6.shared.ReportGenerator;


public class CharacterGroupExamplesReportGenerator extends ReportGenerator {
    private final UnicodeBlock group;

    private final Map<String, Set<String>> examples = new HashMap<>();

    private final ReportFormat format;

    private final Set<String> tagWhitelist;

    public CharacterGroupExamplesReportGenerator(final ReportFormat format, final UnicodeBlock group,
            final Set<String> tagWhitelist, final String outputPath) {
        super(outputPath);

        this.format = format;
        this.group = group;
        this.tagWhitelist = tagWhitelist;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(Entity entity) {
        for (Tag tag : entity.getTags()) {
            if (!tagWhitelist.contains(tag.getKey())) {
                continue;
            }

            String value = tag.getValue();

            if (value.codePoints().anyMatch(codePoint -> group.equals(UnicodeBlock.of(codePoint)))) {
                examples.computeIfAbsent(tag.getKey(), key -> new HashSet<>()).add(value);
            }
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void generate() throws IOException {
        CharacterGroupExamplesReportModel model = new CharacterGroupExamplesReportModel();
        model.setGroup(group);
        model.setExamples(examples);

        switch (format) {
        case CSV:
            new CharacterGroupExamplesReportCsv(model).save(getOutputPath());
            break;

        case YAML:
            new CharacterGroupExamplesReportYaml(model).save(getOutputPath());
            break;

        case JSON:
            new CharacterGroupExamplesReportJson(model).save(getOutputPath());
            break;

        default:
            throw new IllegalStateException("Unsupported report format: " + format);
        }
    }

}
