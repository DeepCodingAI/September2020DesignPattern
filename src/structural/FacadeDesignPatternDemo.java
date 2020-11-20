package structural;

public class FacadeDesignPatternDemo {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(ReportType.HTML,null);
        reportGenerator.generateReport(ReportType.PDF,null);
    }
}
