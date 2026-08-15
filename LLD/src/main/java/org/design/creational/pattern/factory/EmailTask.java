package org.design.creational.pattern.factory;

public class EmailTask implements Task {
    @Override
    public void execute() {
        System.out.println("Executing Email Task");
    }
}
