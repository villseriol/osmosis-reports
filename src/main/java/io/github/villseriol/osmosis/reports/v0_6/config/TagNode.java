// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.config;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "tag")
public class TagNode {
    @JacksonXmlProperty(isAttribute = true, localName = "key")
    private String key;

    public String getKey() {
        return key;
    }


    public void setKey(String key) {
        this.key = key;
    }
}
