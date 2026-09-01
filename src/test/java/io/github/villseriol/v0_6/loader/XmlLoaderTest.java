// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.v0_6.loader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;

import io.github.villseriol.osmosis.reports.v0_6.config.OsmosisReportsConfig;
import io.github.villseriol.osmosis.reports.v0_6.config.ReportAlias;
import io.github.villseriol.osmosis.reports.v0_6.config.ReportFormat;
import io.github.villseriol.osmosis.reports.v0_6.config.ReportNode;
import io.github.villseriol.osmosis.reports.v0_6.loader.XmlLoader;


public class XmlLoaderTest extends AbstractDataTest {
    private final XmlLoader<OsmosisReportsConfig> loader = XmlLoader.getInstance(OsmosisReportsConfig.class);

    @Test
    public void testLoadEmptyConfiguration() {
        File configFile = dataUtils.createDataFile("v0_6/empty-configuration.xml");

        OsmosisReportsConfig config = loader.load(configFile);

        assertNotNull(config);
        assertNotNull(config.getReports());
        assertTrue(config.getReports().isEmpty());
    }


    @Test
    public void testLoadSingleReportConfiguration() {
        File configFile = dataUtils.createDataFile("v0_6/single-report-configuration.xml");

        OsmosisReportsConfig config = loader.load(configFile);

        assertNotNull(config);
        assertEquals(1, config.getReports().size());

        ReportNode report = config.getReports().get(0);
        assertEquals(ReportAlias.CHARACTER_FREQUENCY, report.getAlias());
        assertEquals(ReportFormat.EXCEL, report.getFormat());
        assertEquals("character-frequency.xlsx", report.getOutputPath());
        assertEquals(1, report.getTags().size());
        assertEquals("name", report.getTags().get(0).getKey());
    }


    @Test
    public void testLoadIncompleteReportConfiguration() {
        File configFile = dataUtils.createDataFile("v0_6/incomplete-report-configuration.xml");

        OsmosisReportsConfig config = loader.load(configFile);

        assertNotNull(config);
        assertEquals(1, config.getReports().size());

        ReportNode report = config.getReports().get(0);
        assertNull(report.getAlias());
        assertNull(report.getFormat());
        assertNull(report.getOutputPath());
        assertNotNull(report.getTags());
        assertTrue(report.getTags().isEmpty());
    }
}
