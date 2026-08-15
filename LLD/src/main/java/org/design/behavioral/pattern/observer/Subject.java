package org.design.behavioral.pattern.observer;

public interface Subject {

        void registerObserver(Observer observer);
        void removeObserver(Observer observer);
        void notifyObservers();
}
