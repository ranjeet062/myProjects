package org.design.creational.pattern.factory;

public class Application {
    Task task;
    public Application(TaskFactory factory) {
        task = factory.createTask();
    }

    public void executeTasks() {
        task.execute();
    }
}
