package org.design.behavioral.pattern.observer;

public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setState("New State 1");
        subject.setState("New State 2");

        subject.removeObserver(observer1);
        subject.setState("State 3");

    }
}
