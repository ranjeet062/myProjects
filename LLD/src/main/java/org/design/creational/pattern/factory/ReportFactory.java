package org.design.creational.pattern.factory;

public class ReportFactory implements TaskFactory {
    @Override
    public Task createTask() {
        return new ReportTask();
    }
}
