package org.design.ai;

public class Test {
    public static void main(String[] args) {
        TaskSchedular schedular = new TaskSchedular();

        Task emailTask = new EmailTask();
        Task reportTask = new ReportTask();

        schedular.scheduleTask(emailTask);
        schedular.scheduleTask(reportTask);
    }
}
