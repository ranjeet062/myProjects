package org.design.behavioral.pattern.mediator;

import java.util.List;

public class ConcreteMediator implements Mediator {

    List<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new java.util.ArrayList<>();
    }
    public ConcreteMediator(List<Colleague> colleagues) {
        this.colleagues = colleagues;
    }
    public List<Colleague> getColleagues() {
        return colleagues;
    }
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
    @Override
    public void notify(Colleague colleague, String event) {
        for (Colleague c : colleagues) {
            if (c != colleague) {
                c.receive(event);
            }
        }
    }
}
