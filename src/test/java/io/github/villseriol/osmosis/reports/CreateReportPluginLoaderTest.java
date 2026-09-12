// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

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

        File expectedCharacterDirectory = templateDirectory("v0_6/train-station-a/expected-character-frequency");
        File outputCharacterFile = dataUtils.newFile();

        File configFile = dataUtils.createDataFile("v0_6/train-station-a/configuration.xml");
        writeOutputPaths(configFile, outputFile, outputCharacterFile);

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
        compareArchive(outputCharacterFile, expectedCharacterDirectory);
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

        File expectedCharacterDirectory = templateDirectory("v0_6/highway-a/expected-character-frequency");
        File outputCharacterFile = dataUtils.newFile();

        File configFile = dataUtils.createDataFile("v0_6/highway-a/configuration.xml");
        writeOutputPaths(configFile, outputFile, outputCharacterFile);

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
        compareArchive(outputCharacterFile, expectedCharacterDirectory);
    }


    /**
     * Resolves a directory of expected files from the test data templates on
     * the classpath.
     */
    private File templateDirectory(final String name) throws IOException {
        try {
            return new File(getClass().getResource("/data/template/" + name).toURI());
        } catch (URISyntaxException e) {
            throw new IOException("Invalid template directory: " + name, e);
        }
    }


    /**
     * Compares each CSV in the archive against the file of the same name in the
     * expected directory, and checks that no file is missing or extra.
     */
    private void compareArchive(final File archive, final File expectedDirectory) throws IOException {
        Set<String> expectedNames = new TreeSet<>();
        Set<String> actualNames = new TreeSet<>();

        try (DirectoryStream<Path> files = Files.newDirectoryStream(expectedDirectory.toPath(), "*.csv")) {
            files.forEach(file -> expectedNames.add(file.getFileName().toString()));
        }

        try (ZipInputStream zip = new ZipInputStream(Files.newInputStream(archive.toPath()), StandardCharsets.UTF_8)) {
            for (ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) {
                actualNames.add(entry.getName());

                File actualFile = dataUtils.newFile();
                Files.write(actualFile.toPath(), zip.readAllBytes());

                dataUtils.compareFiles(actualFile, new File(expectedDirectory, entry.getName()));
            }
        }

        assertEquals(expectedNames, actualNames);
    }


    /**
     * Points each report in the configuration at its temporary output file.
     */
    private void writeOutputPaths(final File configFile, final File outputFile, final File outputCharacterFile)
            throws IOException {
        String configuration = Files.readString(configFile.toPath(), StandardCharsets.UTF_8);

        configuration = configuration.replace("%OUTPUT_PATH_CHARACTER_FREQUENCY_CSV%", outputCharacterFile.getPath());
        configuration = configuration.replace("%OUTPUT_PATH_CHARACTER_GROUP_FREQUENCY_YAML%", outputFile.getPath());

        Files.writeString(configFile.toPath(), configuration, StandardCharsets.UTF_8);
    }
}
