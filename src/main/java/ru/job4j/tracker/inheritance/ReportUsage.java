package ru.job4j.tracker.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        JSONReport jsonReport = new JSONReport();
        String json = jsonReport.generate("Report's name", "Report's body");
        System.out.println(json);
    }
}
