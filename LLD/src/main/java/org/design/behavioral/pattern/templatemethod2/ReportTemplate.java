package org.design.behavioral.pattern.templatemethod2;

public abstract class ReportTemplate {
    public void generateReport() {
        printHeader();
        printBody();
        printFooter();
    }
    protected void printHeader() {
        System.out.println("----- Report Header -----");
    }
    protected abstract void printBody();
    protected  void printFooter() {
        System.out.println("----- Report Footer -----");
    }

}
