// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.models;

import java.util.HashMap;
import java.util.Map;


public class CharacterFrequencyReportModel {
    private Map<Character, Long> occurrences = new HashMap<>();

    public CharacterFrequencyReportModel() {
        super();
    }


    public void setOccurrences(Map<Character, Long> occurrences) {
        this.occurrences = occurrences;
    }


    public Map<Character, Long> getOccurrences() {
        return occurrences;
    }
}
