package org.design.creational.pattern.abstractfactory;

import org.design.creational.pattern.factory.Task;

public class Application {
    private final Task task;
    public Application(AbstractFactory factory) {
        this.task = factory.createTaskFactory().createTask();
    }
    public void executeTasks() {
        task.execute();
    }
}
