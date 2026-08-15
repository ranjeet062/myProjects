package org.design.structural.pattern.adapter;

public class LatestPrinter implements Printer {
    @Override
    public void print(String text) {
        System.out.println("Latest Printer: " + text);
    }
}
