package org.design.creational.pattern.abstractfactory;

import org.design.creational.pattern.factory.ReportFactory;
import org.design.creational.pattern.factory.TaskFactory;

public class ReportAbstractFactory implements AbstractFactory {
    @Override
    public TaskFactory createTaskFactory() {
        return new ReportFactory();
    }
}
