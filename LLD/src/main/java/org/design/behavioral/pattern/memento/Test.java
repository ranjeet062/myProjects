package org.design.behavioral.pattern.memento;

public class Test {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("State 1");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State 2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State 3");

        System.out.println("Current State: " + originator.getState());

        originator.restoreStateFromMemento(caretaker.getMemento(0));
        System.out.println("Restored to State: " + originator.getState());
    }
}
