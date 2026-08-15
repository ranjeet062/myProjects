package org.design.ai.low;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedularTesting {
    public static void main(String[] args) {


        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Task to send emails
        Runnable sendEmailTask = () -> System.out.println("Sending email at: " + System.currentTimeMillis());

        // Task to generate reports
        Runnable generateReportTask = () -> System.out.println("Generating report at: " + System.currentTimeMillis());

        // Schedule tasks
        scheduler.scheduleAtFixedRate(sendEmailTask, 0, 10, TimeUnit.SECONDS); // Executes every 10 seconds
        scheduler.scheduleAtFixedRate(generateReportTask, 5, 15, TimeUnit.SECONDS); // Executes every 15 seconds, starting after 5 seconds

        // Add shutdown hook to gracefully terminate the scheduler
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down scheduler...");
            scheduler.shutdown();
            try {
                if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                    System.out.println("Forcing shutdown...");
                    scheduler.shutdownNow();
                }
            } catch (InterruptedException e) {
                scheduler.shutdownNow();
            }
        }));
    }
}

