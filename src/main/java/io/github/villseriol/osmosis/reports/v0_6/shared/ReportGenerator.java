// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.shared;

import java.io.IOException;


public abstract class ReportGenerator implements HasEntityVisitor {
    private final String outputPath;

    protected ReportGenerator(final String outputPath) {
        super();

        this.outputPath = outputPath;
    }


    public String getOutputPath() {
        return outputPath;
    }


    public abstract void generate() throws IOException;

}
