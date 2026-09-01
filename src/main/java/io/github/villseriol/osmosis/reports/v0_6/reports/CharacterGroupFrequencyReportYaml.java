// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.reports;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.github.villseriol.osmosis.reports.v0_6.models.CharacterGroupFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.HasReportWriter;
import io.github.villseriol.osmosis.reports.v0_6.shared.UnicodeBlockOrder;
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
        List<Map<String, Object>> groups = new ArrayList<>();

        model.getOccurrences().entrySet().stream().sorted(UnicodeBlockOrder.byEntryStart()).forEach(occurrence -> {
            Map<String, Object> group = new LinkedHashMap<>();
            group.put("id", occurrence.getKey().toString());
            group.put("occurrences", occurrence.getValue());

            groups.add(group);
        });

        YAMLMapper mapper = YAMLMapper.builder().disable(StreamWriteFeature.AUTO_CLOSE_TARGET).build();

        mapper.writeValue(out, Collections.singletonMap("groups", groups));
    }

}
