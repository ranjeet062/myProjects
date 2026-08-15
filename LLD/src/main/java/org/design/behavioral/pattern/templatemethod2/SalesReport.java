package org.design.behavioral.pattern.templatemethod2;

public class SalesReport extends ReportTemplate {


    @Override
    protected void printHeader() {
        super.printHeader();
        System.out.println("Sales Report Header: This section contains sales report title and date.");
    }

    @Override
    protected void printBody() {
        System.out.println("Sales Report Body: This section contains sales data and analysis.");
    }

    @Override
    protected void printFooter() {
        System.out.println("Sales Report Footer: This section contains summary and contact information.");
    }
}
