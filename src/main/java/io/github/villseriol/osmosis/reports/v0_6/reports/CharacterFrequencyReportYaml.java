// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.reports;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.github.villseriol.osmosis.reports.v0_6.models.CharacterFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.HasReportWriter;
import tools.jackson.core.StreamWriteFeature;
import tools.jackson.dataformat.yaml.YAMLMapper;


public class CharacterFrequencyReportYaml implements HasReportWriter {
    /**
     * Renders a code point in the {@code U+XXXX} notation, widening past four
     * digits when required.
     */
    private static final String ID_FORMAT = "U+%04X";

    private final CharacterFrequencyReportModel model;

    public CharacterFrequencyReportYaml(final CharacterFrequencyReportModel model) {
        super();

        this.model = model;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(OutputStream out) throws IOException {
        List<Map<String, Object>> characters = new ArrayList<>();

        model.getOccurrences().entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(occurrence -> {
            Map<String, Object> character = new LinkedHashMap<>();
            character.put("id", String.format(ID_FORMAT, occurrence.getKey()));
            character.put("occurrences", occurrence.getValue());

            characters.add(character);
        });

        YAMLMapper mapper = YAMLMapper.builder().disable(StreamWriteFeature.AUTO_CLOSE_TARGET).build();

        mapper.writeValue(out, Collections.singletonMap("mappings", characters));
    }

}
