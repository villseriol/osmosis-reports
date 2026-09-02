// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum ReportFormat {
    /**
     * TODO.
     */
    CSV("csv"),
    /**
     * TODO.
     */
    YAML("yaml");

    private final String format;

    ReportFormat(String format) {
        this.format = format;
    }


    @JsonValue
    public String getFormat() {
        return format;
    }


    @JsonCreator
    public static ReportFormat fromFormat(String format) {
        for (ReportFormat value : values()) {
            if (value.format.equals(format)) {
                return value;
            }
        }

        throw new IllegalArgumentException("Unknown format: " + format);
    }
}
