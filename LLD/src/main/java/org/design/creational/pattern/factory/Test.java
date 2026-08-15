package org.design.creational.pattern.factory;

public class Test {
    public static void main(String[] args) {
        TaskFactory emailFactory = new EmailFactory();
        Task emailTask = emailFactory.createTask();
        emailTask.execute();

        TaskFactory reportFactory = new ReportFactory();
        Task reportTask = reportFactory.createTask();
        reportTask.execute();
    }
}
