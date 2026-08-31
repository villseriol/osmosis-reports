// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6;

import org.openstreetmap.osmosis.core.pipeline.common.TaskConfiguration;
import org.openstreetmap.osmosis.core.pipeline.common.TaskManager;
import org.openstreetmap.osmosis.core.pipeline.common.TaskManagerFactory;
import org.openstreetmap.osmosis.core.pipeline.v0_6.SinkManager;


public class CreateReportTaskFactory extends TaskManagerFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    protected TaskManager createTaskManagerImpl(TaskConfiguration taskConfig) {
        String reportName = getStringArgument(taskConfig, "name");
        String outputFile = getStringArgument(taskConfig, "outputFile");

        return new SinkManager(taskConfig.getId(), new CreateReportTask(reportName, outputFile),
                taskConfig.getPipeArgs());
    }
}
