package org.design.behavioral.pattern.observer1;

public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock("AAPL", 150.0);

        LogObserver logObserver = new LogObserver("Log");
        DisplayObserver displayObserver = new DisplayObserver("Display");
        stock.registerObserver(logObserver);
        stock.registerObserver(displayObserver);

        stock.setPrice(155.0);
        stock.setPrice(160.0);

        stock.removeObserver(logObserver);
        stock.setPrice(165.0);

    }
}
