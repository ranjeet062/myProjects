package org.design.creational.pattern.abstractfactory;

public class ApplicationTest {

    public static void main(String[] args) {
        Application app = new Application(new EmailAbstractFactory());
        app.executeTasks();

        Application app2 = new Application(new ReportAbstractFactory());
        app2.executeTasks();
    }
}
