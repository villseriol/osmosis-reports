// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.reports;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.io.output.CloseShieldOutputStream;

import io.github.villseriol.osmosis.reports.v0_6.models.CharacterGroupExamplesReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.HasReportWriter;


public class CharacterGroupExamplesReportCsv implements HasReportWriter {
    private static final CSVFormat FORMAT = CSVFormat.DEFAULT.builder().setHeader("tag", "examples")
            .setRecordSeparator("\n").get();

    private final CharacterGroupExamplesReportModel model;

    public CharacterGroupExamplesReportCsv(final CharacterGroupExamplesReportModel model) {
        super();

        this.model = model;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(OutputStream out) throws IOException {
        Map<String, Set<String>> examples = new TreeMap<>(model.getExamples());

        Writer writer = new BufferedWriter(
                new OutputStreamWriter(CloseShieldOutputStream.wrap(out), StandardCharsets.UTF_8));

        try (CSVPrinter printer = new CSVPrinter(writer, FORMAT)) {
            for (Map.Entry<String, Set<String>> example : examples.entrySet()) {
                for (String value : new TreeSet<>(example.getValue())) {
                    printer.printRecord(example.getKey(), value);
                }
            }
        }
    }

}
