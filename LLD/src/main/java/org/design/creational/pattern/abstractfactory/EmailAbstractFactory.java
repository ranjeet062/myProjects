package org.design.creational.pattern.abstractfactory;

import org.design.creational.pattern.factory.EmailFactory;
import org.design.creational.pattern.factory.TaskFactory;

public class EmailAbstractFactory implements AbstractFactory {
    @Override
    public TaskFactory createTaskFactory() {
        return new EmailFactory();
    }

}
