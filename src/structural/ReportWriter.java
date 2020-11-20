package structural;

public class ReportWriter {

    public void writeHtmlReport(Report report){
        System.out.println(".......Generating HTML report........");
        report.getReportHeader().getHeaderInformation();
        report.getReportData().getReportDataCompiled();
        report.getReportFooter().getFooterInformation();
    }
    public void writePDFReport(Report report){
        System.out.println(".......Generating PDF report........");
        report.getReportHeader().getHeaderInformation();
        report.getReportData().getReportDataCompiled();
        report.getReportFooter().getFooterInformation();
    }
}
