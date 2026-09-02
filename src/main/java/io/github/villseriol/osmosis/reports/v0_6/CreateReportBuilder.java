// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import io.github.villseriol.osmosis.reports.v0_6.config.CreateReportConfig;
import io.github.villseriol.osmosis.reports.v0_6.config.ReportNode;
import io.github.villseriol.osmosis.reports.v0_6.generators.CharacterFrequencyReportGenerator;
import io.github.villseriol.osmosis.reports.v0_6.generators.CharacterGroupExamplesReportGenerator;
import io.github.villseriol.osmosis.reports.v0_6.generators.CharacterGroupFrequencyReportGenerator;
import io.github.villseriol.osmosis.reports.v0_6.shared.ReportGenerator;


public class CreateReportBuilder {
    private static final Logger LOG = Logger.getLogger(CreateReportBuilder.class.getName());

    private final CreateReportConfig configuration;

    public CreateReportBuilder(final CreateReportConfig configuration) {
        super();

        this.configuration = configuration;
    }


    public List<ReportGenerator> build() {
        List<ReportGenerator> builders = new ArrayList<>();

        for (ReportNode report : configuration.getReports()) {
            LOG.log(Level.FINE, "Building report " + report.getAlias() + " into " + report.getOutputPath());

            builders.add(build(report));
        }

        return builders;
    }


    private ReportGenerator build(final ReportNode report) {
        Set<String> tagWhitelist = report.getTags().stream().map(tag -> tag.getKey()).collect(Collectors.toSet());

        switch (report.getAlias()) {
        case CHARACTER_FREQUENCY:
            return new CharacterFrequencyReportGenerator(report.getFormat(), tagWhitelist, report.getOutputPath());

        case CHARACTER_GROUP_EXAMPLES:
            if (report.getRange() == null) {
                throw new IllegalArgumentException("Report " + report.getAlias() + " requires a range");
            }

            return new CharacterGroupExamplesReportGenerator(report.getFormat(), report.getRange().getBlock(),
                    tagWhitelist, report.getOutputPath());

        case CHARACTER_GROUP_FREQUENCY:
            return new CharacterGroupFrequencyReportGenerator(report.getFormat(), tagWhitelist, report.getOutputPath());

        default:
            throw new UnsupportedOperationException("Unsupported report alias: " + report.getAlias());
        }
    }
}
