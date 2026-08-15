package org.design.behavioral.pattern.templatemethod2;

public class InventoryReport extends ReportTemplate {
    @Override
    protected void printBody() {
        System.out.println("Inventory Report Body: List of items in stock.");
    }
}
