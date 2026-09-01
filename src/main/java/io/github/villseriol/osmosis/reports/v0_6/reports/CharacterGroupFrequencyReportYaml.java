// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.reports;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.Character.UnicodeBlock;
import java.util.Map;
import java.util.TreeMap;

import io.github.villseriol.osmosis.reports.v0_6.models.CharacterGroupFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.HasReportWriter;
import tools.jackson.core.StreamWriteFeature;
import tools.jackson.dataformat.yaml.YAMLMapper;


public class CharacterGroupFrequencyReportYaml implements HasReportWriter {
    private final CharacterGroupFrequencyReportModel model;

    public CharacterGroupFrequencyReportYaml(final CharacterGroupFrequencyReportModel model) {
        super();

        this.model = model;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(OutputStream out) throws IOException {
        Map<String, Long> occurrences = new TreeMap<>();

        for (Map.Entry<UnicodeBlock, Long> occurrence : model.getOccurrences().entrySet()) {
            occurrences.put(occurrence.getKey().toString(), occurrence.getValue());
        }

        YAMLMapper mapper = YAMLMapper.builder().disable(StreamWriteFeature.AUTO_CLOSE_TARGET).build();

        mapper.writeValue(out, occurrences);
    }

}
