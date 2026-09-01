// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openstreetmap.osmosis.core.container.v0_6.EntityContainer;
import org.openstreetmap.osmosis.core.task.v0_6.Sink;

import io.github.villseriol.osmosis.reports.v0_6.config.OsmosisReportsConfig;
import io.github.villseriol.osmosis.reports.v0_6.loader.XmlLoader;


public class CreateReportTask implements Sink {
    private static final Logger LOG = Logger.getLogger(CreateReportTask.class.getName());

    private final OsmosisReportsConfig configuration;

    public CreateReportTask(final String configFile) {
        LOG.log(Level.FINE, "Reports configured with " + configFile);

        XmlLoader<OsmosisReportsConfig> loader = XmlLoader.getInstance(OsmosisReportsConfig.class);
        this.configuration = loader.load(configFile);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(Map<String, Object> metaData) {
        LOG.info("initialize");
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void complete() {
        LOG.info("complete");
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
