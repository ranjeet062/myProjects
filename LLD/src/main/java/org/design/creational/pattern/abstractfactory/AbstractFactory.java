package org.design.creational.pattern.abstractfactory;

import org.design.creational.pattern.factory.TaskFactory;

public interface AbstractFactory {
    TaskFactory createTaskFactory();
}
