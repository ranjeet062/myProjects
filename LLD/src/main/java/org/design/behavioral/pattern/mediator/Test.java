package org.design.behavioral.pattern.mediator;

public class Test {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague colleagueA = new ColleagueA(mediator);
        Colleague colleagueB = new ColleagueB(mediator);

        mediator.addColleague(colleagueA);
        mediator.addColleague(colleagueB);
        colleagueA.send("Hello from Colleague A");
        colleagueB.send("Hello from Colleague B");
    }
}
