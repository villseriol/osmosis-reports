// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.models;

import java.lang.Character.UnicodeBlock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class CharacterGroupExamplesReportModel {
    private UnicodeBlock group;

    private Map<String, Set<String>> examples = new HashMap<>();

    public CharacterGroupExamplesReportModel() {
        super();
    }


    public void setGroup(UnicodeBlock group) {
        this.group = group;
    }


    public UnicodeBlock getGroup() {
        return group;
    }


    public void setExamples(Map<String, Set<String>> examples) {
        this.examples = examples;
    }


    public Map<String, Set<String>> getExamples() {
        return examples;
    }
}
