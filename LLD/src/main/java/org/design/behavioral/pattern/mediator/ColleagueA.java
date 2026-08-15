package org.design.behavioral.pattern.mediator;

public class ColleagueA extends Colleague {

    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("ColleagueA sending: " + message);
        mediator.notify(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("ColleagueA received: " + message);
       // mediator.notify(this, message);
    }
}
