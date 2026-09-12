// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.reports;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.io.output.CloseShieldOutputStream;

import io.github.villseriol.osmosis.reports.v0_6.config.UnicodeRange;
import io.github.villseriol.osmosis.reports.v0_6.models.CharacterGroupFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.HasReportWriter;
import io.github.villseriol.osmosis.reports.v0_6.shared.UnicodeBlockOrder;


public class CharacterGroupFrequencyReportCsv implements HasReportWriter {
    private static final Logger LOG = Logger.getLogger(CharacterGroupFrequencyReportCsv.class.getName());

    private static final CSVFormat FORMAT = CSVFormat.DEFAULT.builder().setHeader("block", "occurrences")
            .setRecordSeparator("\n").get();

    private final CharacterGroupFrequencyReportModel model;

    public CharacterGroupFrequencyReportCsv(final CharacterGroupFrequencyReportModel model) {
        super();

        this.model = model;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(OutputStream out) throws IOException {
        Map<String, Long> occurrences = new LinkedHashMap<>();

        model.getOccurrences().entrySet().stream().sorted(UnicodeBlockOrder.byEntryStart()).forEach(occurrence -> {
            UnicodeRange range;

            try {
                range = UnicodeRange.fromBlock(occurrence.getKey());
            } catch (IllegalArgumentException e) {
                LOG.log(Level.WARNING, e, () -> "Skipping block outside of any unicode range: " + occurrence.getKey());

                return;
            }

            occurrences.put(range.getAlias(), occurrence.getValue());
        });

        Writer writer = new BufferedWriter(
                new OutputStreamWriter(CloseShieldOutputStream.wrap(out), StandardCharsets.UTF_8));

        try (CSVPrinter printer = new CSVPrinter(writer, FORMAT)) {
            for (Map.Entry<String, Long> occurrence : occurrences.entrySet()) {
                printer.printRecord(occurrence.getKey(), occurrence.getValue());
            }
        }
    }

}
