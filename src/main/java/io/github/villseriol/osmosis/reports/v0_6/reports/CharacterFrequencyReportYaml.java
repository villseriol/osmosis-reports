// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.reports;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.github.villseriol.osmosis.reports.v0_6.config.UnicodeRange;
import io.github.villseriol.osmosis.reports.v0_6.models.CharacterFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.HasReportWriter;
import tools.jackson.core.StreamWriteFeature;
import tools.jackson.dataformat.yaml.YAMLMapper;


public class CharacterFrequencyReportYaml implements HasReportWriter {
    private static final Logger LOG = Logger.getLogger(CharacterFrequencyReportYaml.class.getName());

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
     * Resolves the range a code point belongs to, or {@code null} when it falls
     * outside every known range.
     */
    private static UnicodeRange range(int codePoint) {
        try {
            return UnicodeRange.fromCodePoint(codePoint);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(OutputStream out) throws IOException {
        Map<UnicodeRange, List<Map<String, Object>>> ranges = new EnumMap<>(UnicodeRange.class);

        model.getOccurrences().entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(occurrence -> {
            UnicodeRange range = range(occurrence.getKey().intValue());

            if (range == null) {
                LOG.log(Level.WARNING, () -> "Skipping code point outside of any unicode range: "
                        + String.format(ID_FORMAT, occurrence.getKey()));

                return;
            }

            Map<String, Object> character = new LinkedHashMap<>();
            character.put("id", String.format(ID_FORMAT, occurrence.getKey()));
            character.put("occurrences", occurrence.getValue());

            ranges.computeIfAbsent(range, key -> new ArrayList<>()).add(character);
        });

        Map<String, Object> characters = new LinkedHashMap<>();

        ranges.forEach((range, entries) -> characters.put(range.getAlias(), entries));

        YAMLMapper mapper = YAMLMapper.builder().disable(StreamWriteFeature.AUTO_CLOSE_TARGET).build();

        mapper.writeValue(out, characters);
    }

}
