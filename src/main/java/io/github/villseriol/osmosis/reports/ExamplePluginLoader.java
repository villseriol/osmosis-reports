// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports;

import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.osmosis.core.pipeline.common.TaskManagerFactory;
import org.openstreetmap.osmosis.core.plugin.PluginLoader;

import io.github.villseriol.osmosis.reports.v0_6.CreateReportTaskFactory;


public class ExamplePluginLoader implements PluginLoader {
    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, TaskManagerFactory> loadTaskFactories() {
        CreateReportTaskFactory transformFactory = new CreateReportTaskFactory();

        Map<String, TaskManagerFactory> tasks = new HashMap<String, TaskManagerFactory>();
        tasks.put("oss-cr", transformFactory);
        tasks.put("oss-cr-0.6", transformFactory);

        tasks.put("oss-create-report", transformFactory);
        tasks.put("oss-create-report-0.6", transformFactory);

        return tasks;
    }
}
