package org.design.creational.pattern.factory;

public class ReportTask implements Task {
    @Override
    public void execute() {
        System.out.println("Executing Report Task");
    }
}
