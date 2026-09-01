// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.config;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;


@JsonRootName(value = "configuration")
public class CreateReportConfig {
    @JacksonXmlElementWrapper(localName = "report-list")
    private List<ReportNode> reports = new ArrayList<>();

    public void setReports(List<ReportNode> reports) {
        this.reports = reports;
    }


    public List<ReportNode> getReports() {
        return reports;
    }
}
