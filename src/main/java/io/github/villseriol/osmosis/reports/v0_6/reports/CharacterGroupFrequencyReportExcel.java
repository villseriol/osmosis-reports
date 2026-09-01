// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.reports;

import org.apache.poi.ss.usermodel.Workbook;

import io.github.villseriol.osmosis.reports.v0_6.models.CharacterGroupFrequencyReportModel;
import io.github.villseriol.osmosis.reports.v0_6.shared.ExcelReport;


public class CharacterGroupFrequencyReportExcel extends ExcelReport {
    private final CharacterGroupFrequencyReportModel model;

    public CharacterGroupFrequencyReportExcel(final CharacterGroupFrequencyReportModel model) {
        super();

        this.model = model;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    protected void setup(Workbook workbook) {
        throw new UnsupportedOperationException("Not implemented");
    }


    /**
     * {@inheritDoc}
     */
    @Override
    protected void save(Workbook workbook) {
        throw new UnsupportedOperationException("Not implemented");
    }

}
