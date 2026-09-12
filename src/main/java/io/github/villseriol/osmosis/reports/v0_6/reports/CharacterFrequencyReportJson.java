// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.reports;

import java.io.IOException;
import java.io.OutputStream;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.github.villseriol.osmosis.reports.v0_6.config.UnicodeRange;
import io.github.villseriol.osmosis.reports.v0_6.models.CharacterFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.HasReportWriter;
import tools.jackson.core.StreamWriteFeature;
import tools.jackson.databind.json.JsonMapper;


public class CharacterFrequencyReportJson implements HasReportWriter {
    private static final Logger LOG = Logger.getLogger(CharacterFrequencyReportJson.class.getName());

    /**
     * Renders a code point in the {@code U+XXXX} notation, widening past four
     * digits when required.
     */
    private static final String ID_FORMAT = "U+%04X";

    private final CharacterFrequencyReportModel model;

    public CharacterFrequencyReportJson(final CharacterFrequencyReportModel model) {
        super();

        this.model = model;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(OutputStream out) throws IOException {
        Map<UnicodeRange, Map<String, Long>> ranges = new EnumMap<>(UnicodeRange.class);

        model.getOccurrences().entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(occurrence -> {
            UnicodeRange range;

            try {
                range = UnicodeRange.fromCodePoint(occurrence.getKey().intValue());
            } catch (IllegalArgumentException e) {
                LOG.log(Level.WARNING, e, () -> "Skipping code point outside of any unicode range: "
                        + String.format(ID_FORMAT, occurrence.getKey()));

                return;
            }

            ranges.computeIfAbsent(range, key -> new LinkedHashMap<>())
                    .put(String.format(ID_FORMAT, occurrence.getKey()), occurrence.getValue());
        });

        Map<String, Object> characters = new LinkedHashMap<>();

        ranges.forEach((range, entries) -> characters.put(range.getAlias(), entries));

        JsonMapper mapper = JsonMapper.builder().disable(StreamWriteFeature.AUTO_CLOSE_TARGET).build();

        mapper.writerWithDefaultPrettyPrinter().writeValue(out, characters);
    }

}
