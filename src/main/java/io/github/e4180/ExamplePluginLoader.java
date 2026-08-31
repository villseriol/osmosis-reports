// This software is released into the Public Domain.  See copying.txt for details.
package io.github.e4180;

import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.osmosis.core.pipeline.common.TaskManagerFactory;
import org.openstreetmap.osmosis.core.plugin.PluginLoader;


public class ExamplePluginLoader implements PluginLoader {
    @Override
    public Map<String, TaskManagerFactory> loadTaskFactories() {
        ExampleTaskFactory transformFactory = new ExampleTaskFactory();

        Map<String, TaskManagerFactory> tasks = new HashMap<String, TaskManagerFactory>();
        tasks.put("example", transformFactory);
        tasks.put("example-0.6", transformFactory);

        return tasks;
    }
}
