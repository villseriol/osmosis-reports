// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6;

import java.util.Map;
import java.util.logging.Logger;

import org.openstreetmap.osmosis.core.container.v0_6.EntityContainer;
import org.openstreetmap.osmosis.core.task.v0_6.Sink;


public class CreateReportTask implements Sink {
    private static final Logger LOG = Logger.getLogger(CreateReportTask.class.getName());

    public CreateReportTask(final String reportName, final String outputFile) {
        super();
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
