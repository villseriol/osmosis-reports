// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum ReportAlias {
    /**
     * TODO.
     */
    CHARACTER_FREQUENCY("character-frequency"),
    /**
     * TODO.
     */
    CHARACTER_GROUP_FREQUENCY("character-group-frequency");

    private final String alias;

    ReportAlias(String alias) {
        this.alias = alias;
    }


    @JsonValue
    public String getAlias() {
        return alias;
    }


    @JsonCreator
    public static ReportAlias fromAlias(String alias) {
        for (ReportAlias value : values()) {
            if (value.alias.equals(alias)) {
                return value;
            }
        }

        throw new IllegalArgumentException("Unknown normalize alias: " + alias);
    }
}
