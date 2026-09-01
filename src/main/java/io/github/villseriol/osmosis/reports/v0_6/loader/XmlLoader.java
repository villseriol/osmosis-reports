// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.loader;

import java.io.File;

import org.openstreetmap.osmosis.core.OsmosisRuntimeException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import tools.jackson.databind.DeserializationFeature;
import tools.jackson.dataformat.xml.XmlMapper;


public final class XmlLoader<T> {
    private final Class<T> configurationType;

    private XmlLoader(Class<T> configurationType) {
        this.configurationType = configurationType;
    }


    public static <T> XmlLoader<T> getInstance(Class<T> configurationType) {
        return new XmlLoader<>(configurationType);
    }


    public T load(File configFile) {
        try {
            XmlMapper mapper = XmlMapper.builder()
                    .changeDefaultVisibility(vc -> vc.withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                            .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                            .withIsGetterVisibility(JsonAutoDetect.Visibility.NONE))
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).build();

            T config = mapper.readValue(configFile, configurationType);

            return config;
        } catch (OsmosisRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new OsmosisRuntimeException("Failed to load user configuration", e);
        }
    }


    public T load(String configFile) {
        File file = new File(configFile);
        return load(file);
    }
}
