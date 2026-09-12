// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.reports;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.github.villseriol.osmosis.reports.v0_6.config.UnicodeRange;
import io.github.villseriol.osmosis.reports.v0_6.models.CharacterGroupFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.HasReportWriter;
import io.github.villseriol.osmosis.reports.v0_6.shared.UnicodeBlockOrder;
import tools.jackson.core.StreamWriteFeature;
import tools.jackson.databind.json.JsonMapper;


public class CharacterGroupFrequencyReportJson implements HasReportWriter {
    private static final Logger LOG = Logger.getLogger(CharacterGroupFrequencyReportJson.class.getName());

    private final CharacterGroupFrequencyReportModel model;

    public CharacterGroupFrequencyReportJson(final CharacterGroupFrequencyReportModel model) {
        super();

        this.model = model;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(OutputStream out) throws IOException {
        Map<String, Long> groups = new LinkedHashMap<>();

        model.getOccurrences().entrySet().stream().sorted(UnicodeBlockOrder.byEntryStart()).forEach(occurrence -> {
            UnicodeRange range;

            try {
                range = UnicodeRange.fromBlock(occurrence.getKey());
            } catch (IllegalArgumentException e) {
                LOG.log(Level.WARNING, e, () -> "Skipping block outside of any unicode range: " + occurrence.getKey());

                return;
            }

            groups.put(range.getAlias(), occurrence.getValue());
        });

        JsonMapper mapper = JsonMapper.builder().disable(StreamWriteFeature.AUTO_CLOSE_TARGET).build();

        mapper.writerWithDefaultPrettyPrinter().writeValue(out, Collections.singletonMap("groups", groups));
    }

}
