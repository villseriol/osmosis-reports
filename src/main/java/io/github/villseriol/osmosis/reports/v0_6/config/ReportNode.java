// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.config;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "report")
public class ReportNode {
    @JacksonXmlElementWrapper(localName = "tag-list")
    private List<TagNode> tags = new ArrayList<>();

    @JacksonXmlProperty(isAttribute = true, localName = "alias")
    private final ReportAlias alias;

    @JacksonXmlProperty(isAttribute = true, localName = "output-path")
    private final String outputPath;

    @JsonCreator
    public ReportNode(
            @JsonProperty(value = "alias", required = true)
            @JacksonXmlProperty(isAttribute = true, localName = "alias") ReportAlias alias,
            @JsonProperty(value = "output-path", required = true)
            @JacksonXmlProperty(isAttribute = true, localName = "output-path") String outputPath) {
        this.alias = alias;
        this.outputPath = outputPath;
    }


    public String getOutputPath() {
        return outputPath;
    }


    public ReportAlias getAlias() {
        return alias;
    }


    public List<TagNode> getTags() {
        return tags;
    }


    public void setTags(List<TagNode> tags) {
        this.tags = tags;
    }
}
