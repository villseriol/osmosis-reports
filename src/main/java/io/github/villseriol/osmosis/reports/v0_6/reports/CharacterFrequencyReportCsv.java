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

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.io.output.CloseShieldOutputStream;

import io.github.villseriol.osmosis.reports.v0_6.models.CharacterFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.HasReportWriter;


public class CharacterFrequencyReportCsv implements HasReportWriter {
    /**
     * Renders a code point in the {@code U+XXXX} notation, widening past four digits when required.
     */
    private static final String ID_FORMAT = "U+%04X";

    private static final CSVFormat FORMAT = CSVFormat.DEFAULT.builder()
            .setHeader("code-point", "occurrences").setRecordSeparator("\n").get();

    private final CharacterFrequencyReportModel model;

    public CharacterFrequencyReportCsv(final CharacterFrequencyReportModel model) {
        super();

        this.model = model;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(OutputStream out) throws IOException {
        Map<String, Long> occurrences = new LinkedHashMap<>();

        model.getOccurrences().entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(occurrence -> occurrences.put(String.format(ID_FORMAT, occurrence.getKey()),
                        occurrence.getValue()));

        Writer writer = new BufferedWriter(
                new OutputStreamWriter(CloseShieldOutputStream.wrap(out), StandardCharsets.UTF_8));

        try (CSVPrinter printer = new CSVPrinter(writer, FORMAT)) {
            for (Map.Entry<String, Long> occurrence : occurrences.entrySet()) {
                printer.printRecord(occurrence.getKey(), occurrence.getValue());
            }
        }
    }

}
