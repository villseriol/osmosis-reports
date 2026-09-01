// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.shared;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;


public interface HasReportWriter {
    void save(OutputStream out) throws IOException;


    default void save(Path path) throws IOException {
        try (OutputStream out = Files.newOutputStream(path)) {
            save(out);
        }
    }


    default void save(String path) throws IOException {
        save(Path.of(path));
    }

}
