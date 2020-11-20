package structural;

import javax.sql.DataSource;

public class ReportGenerator {
    public void generateReport(ReportType reportType, DataSource dataSource){
        if(reportType == null || dataSource == null){
            System.out.println("Data fetch was not successful, please check the datasource");
        }
        Report report = new Report();
        report.setReportHeader(new ReportHeader());
        report.setReportFooter(new ReportFooter());
        report.setReportData(new ReportData());

        ReportWriter writer = new ReportWriter();
        switch (reportType){
            case HTML:
                writer.writeHtmlReport(report);
                break;
            case PDF:
                writer.writePDFReport(report);
                break;
        }

    }
}
