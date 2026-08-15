package org.design.behavioral.pattern.observer1;

public class LogObserver implements Observer {

    private String name;
    public LogObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(double price) {
        System.out.println("DisplayObserver " + name + " received update: " + price);

    }
}
