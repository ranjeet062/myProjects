package org.design.behavioral.pattern.observer1;

public class DisplayObserver implements Observer {
    private String name;

    public DisplayObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(double message) {
        System.out.println("DisplayObserver " + name + " received update: " + message);
    }
}
