// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.reports;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import io.github.villseriol.osmosis.reports.v0_6.models.CharacterGroupExamplesReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.HasReportWriter;
import tools.jackson.core.StreamWriteFeature;
import tools.jackson.dataformat.yaml.YAMLMapper;


public class CharacterGroupExamplesReportYaml implements HasReportWriter {
    private final CharacterGroupExamplesReportModel model;

    public CharacterGroupExamplesReportYaml(final CharacterGroupExamplesReportModel model) {
        super();

        this.model = model;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(OutputStream out) throws IOException {
        List<Map<String, Object>> examples = new ArrayList<>();

        new TreeMap<>(model.getExamples()).forEach((key, values) -> {
            Map<String, Object> example = new LinkedHashMap<>();
            example.put("key", key);
            example.put("values", new ArrayList<>(new TreeSet<>(values)));

            examples.add(example);
        });

        YAMLMapper mapper = YAMLMapper.builder().disable(StreamWriteFeature.AUTO_CLOSE_TARGET).build();

        mapper.writeValue(out, Collections.singletonMap("examples", examples));
    }

}
