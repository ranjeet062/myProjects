package org.design.creational.pattern.factory;

public class ApplicationTest {
    public static void main(String[] args) {
        Application app = new Application(new EmailFactory());
        app.executeTasks();

        Application app2 = new Application(new ReportFactory());
        app2.executeTasks();
    }
}
