// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.shared;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public abstract class ExcelReport implements HasReportWriter {
    protected abstract void save(Workbook workbook);


    /**
     * Allows a user to hook into the report generation lifecycle. Executed once
     * before generating the actual report. Use it to setup fonts and styles.
     *
     * @param workbook the workbook
     */
    protected abstract void setup(Workbook workbook);


    /**
     * {@inheritDoc}
     */
    @Override
    public final void save(OutputStream out) throws IOException {
        try (Workbook workbook = new XSSFWorkbook()) {
            setup(workbook);
            save(workbook);
            workbook.write(out);
        }
    }

}
