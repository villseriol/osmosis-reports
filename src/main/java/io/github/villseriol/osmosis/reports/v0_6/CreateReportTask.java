// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openstreetmap.osmosis.core.OsmosisRuntimeException;
import org.openstreetmap.osmosis.core.container.v0_6.EntityContainer;
import org.openstreetmap.osmosis.core.task.v0_6.Sink;

import io.github.villseriol.osmosis.reports.v0_6.config.CreateReportConfig;
import io.github.villseriol.osmosis.reports.v0_6.loader.XmlLoader;
import io.github.villseriol.osmosis.reports.v0_6.shared.ReportGenerator;


public class CreateReportTask implements Sink {
    private static final Logger LOG = Logger.getLogger(CreateReportTask.class.getName());

    private final CreateReportConfig configuration;

    private final CreateReportBuilder builder;

    private List<ReportGenerator> generators;

    public CreateReportTask(final String configFile) {
        LOG.log(Level.FINE, "Reports configured with " + configFile);

        XmlLoader<CreateReportConfig> loader = XmlLoader.getInstance(CreateReportConfig.class);
        this.configuration = loader.load(configFile);
        this.builder = new CreateReportBuilder(this.configuration);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(Map<String, Object> metaData) {
        LOG.info("initialize");

        this.generators = this.builder.build();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void complete() {
        LOG.info("complete");

        for (ReportGenerator generator : generators) {
            try {
                generator.generate();
            } catch (IOException e) {
                throw new OsmosisRuntimeException("Failed to generate report " + generator.getOutputPath(), e);
            }
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {
        LOG.info("close");
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void process(EntityContainer entityContainer) {
        LOG.info("process");
    }

}
