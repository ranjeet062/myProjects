package org.design.structural.pattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {

        Printer printer = new PrinterAdapter(new LegacyPrinter());
        printer.print("Hello, Adapter Pattern!");

        Printer printer1 = new LatestPrinter();
        printer1.print("Hello, Latest Printer!");
    }
}
