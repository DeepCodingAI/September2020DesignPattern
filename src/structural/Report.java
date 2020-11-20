package structural;

public class Report {
    private ReportHeader reportHeader;
    private ReportFooter reportFooter;
    private ReportData reportData;

    public ReportHeader getReportHeader() {
        return reportHeader;
    }

    public void setReportHeader(ReportHeader reportHeader) {
        this.reportHeader = reportHeader;
    }

    public ReportFooter getReportFooter() {
        return reportFooter;
    }

    public void setReportFooter(ReportFooter reportFooter) {
        this.reportFooter = reportFooter;
    }

    public ReportData getReportData() {
        return reportData;
    }

    public void setReportData(ReportData reportData) {
        this.reportData = reportData;
    }
}
