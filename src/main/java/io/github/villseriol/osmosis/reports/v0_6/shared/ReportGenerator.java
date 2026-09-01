// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.shared;

import java.io.IOException;

import org.openstreetmap.osmosis.core.domain.v0_6.Entity;


public abstract class ReportGenerator {
    private final String outputPath;

    protected ReportGenerator(final String outputPath) {
        super();

        this.outputPath = outputPath;
    }


    public String getOutputPath() {
        return outputPath;
    }


    public abstract void visit(Entity entity);


    public abstract void generate() throws IOException;

}
