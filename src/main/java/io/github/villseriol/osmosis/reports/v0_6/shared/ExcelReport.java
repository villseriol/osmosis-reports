// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.shared;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public abstract class ExcelReport {
    protected abstract void generate(Workbook workbook);


    protected abstract void setup(Workbook workbook);


    public final void generate(OutputStream out) throws IOException {
        try (Workbook workbook = new XSSFWorkbook()) {
            setup(workbook);
            generate(workbook);
            workbook.write(out);
        }
    }


    public final void generate(Path path) throws IOException {
        try (OutputStream out = Files.newOutputStream(path)) {
            generate(out);
        }
    }


    public final void generate(String path) throws IOException {
        generate(Path.of(path));
    }

}
