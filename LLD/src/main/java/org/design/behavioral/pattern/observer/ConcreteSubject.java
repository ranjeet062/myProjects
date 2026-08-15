package org.design.behavioral.pattern.observer;

import java.util.List;

public class ConcreteSubject {
    private String state;

    List<Observer> observers = new java.util.ArrayList<>();

    public ConcreteSubject(String state) {
        this.state = state;
    }
    public ConcreteSubject() {
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }


    public void registerObserver(Observer observer) {

        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(state);
        }
    }
}
