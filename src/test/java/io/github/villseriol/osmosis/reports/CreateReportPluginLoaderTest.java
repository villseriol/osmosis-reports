// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import org.junit.Test;
import org.openstreetmap.osmosis.core.Osmosis;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;


public class CreateReportPluginLoaderTest extends AbstractDataTest {
    /**
     * The unicode blocks that we are expecting change depending on the Java
     * version. This is designed to be compatible with Java 17.
     *
     * @throws IOException
     */
    @Test
    public void testTrainStationNode() throws IOException {
        File sourceFile = dataUtils.createDataFile("v0_6/train-station-a/1901864597.xml");
        File expectedFile = dataUtils.createDataFile("v0_6/train-station-a/expected-character-group-frequency.yaml");
        File outputFile = dataUtils.newFile();

        File configFile = dataUtils.createDataFile("v0_6/train-station-a/configuration.xml");
        writeOutputPath(configFile, outputFile);

        // @formatter:off
        Osmosis.run(new String[] {
            "-q",
            "-p",
            "io.github.villseriol.osmosis.reports.CreateReportPluginLoader",
            "--read-xml-0.6",
            sourceFile.getPath(),
            "--oss-cr-0.6",
            "file=" + configFile });
        // @formatter:on

        dataUtils.compareFiles(outputFile, expectedFile);
    }


    /**
     * The unicode blocks that we are expecting change depending on the Java
     * version. This is designed to be compatible with Java 17.
     *
     * @throws IOException
     */
    @Test
    public void testHighwayWay() throws IOException {
        File sourceFile = dataUtils.createDataFile("v0_6/highway-a/28127324.xml");
        File expectedFile = dataUtils.createDataFile("v0_6/highway-a/expected-character-group-frequency.yaml");
        File outputFile = dataUtils.newFile();

        File configFile = dataUtils.createDataFile("v0_6/highway-a/configuration.xml");
        writeOutputPath(configFile, outputFile);

        // @formatter:off
        Osmosis.run(new String[] {
            "-q",
            "-p",
            "io.github.villseriol.osmosis.reports.CreateReportPluginLoader",
            "--read-xml-0.6",
            sourceFile.getPath(),
            "--oss-cr-0.6",
            "file=" + configFile });
        // @formatter:on

        dataUtils.compareFiles(outputFile, expectedFile);
    }


    /**
     * Points the report configuration at the temporary output file.
     */
    private void writeOutputPath(final File configFile, final File outputFile) throws IOException {
        String configuration = Files.readString(configFile.toPath(), StandardCharsets.UTF_8);

        Files.writeString(configFile.toPath(), configuration.replace("%OUTPUT_PATH%", outputFile.getPath()),
                StandardCharsets.UTF_8);
    }
}
