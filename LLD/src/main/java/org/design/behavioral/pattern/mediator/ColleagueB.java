package org.design.behavioral.pattern.mediator;

public class ColleagueB extends Colleague {

    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {

        System.out.println("ColleagueB sending: " + message);
        mediator.notify(this, message);
    }

    public void receive(String message) {
        System.out.println("ColleagueB received: " + message);
       // mediator.notify(this, message);
    }
}
