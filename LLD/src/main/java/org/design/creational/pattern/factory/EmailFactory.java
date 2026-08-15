package org.design.creational.pattern.factory;

public class EmailFactory implements TaskFactory {
    @Override
    public Task createTask() {
        return new EmailTask();
    }
}
