package org.design.behavioral.pattern.templatemethod2;

public class Test {
    public static void main(String[] args) {
        ReportTemplate report1 = new SalesReport();
        report1.generateReport();
        ReportTemplate report2 = new InventoryReport();
        report2.generateReport();

    }
}
