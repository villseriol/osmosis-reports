// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.models;

import java.lang.Character.UnicodeBlock;
import java.util.HashMap;
import java.util.Map;


public class CharacterGroupFrequencyReportModel {
    private Map<UnicodeBlock, Long> occurrences = new HashMap<>();

    public CharacterGroupFrequencyReportModel() {
        super();
    }


    public Map<UnicodeBlock, Long> getOccurrences() {
        return occurrences;
    }


    public void setOccurrences(final Map<UnicodeBlock, Long> occurrences) {
        this.occurrences = occurrences;
    }

}
