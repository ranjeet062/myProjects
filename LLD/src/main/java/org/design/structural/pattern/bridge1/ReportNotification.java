package org.design.structural.pattern.bridge1;

public class ReportNotification extends Notification {

    public ReportNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    void notifyUser(String message) {
        System.out.print("Report Notification: ");
        messageSender.sendMessage(message);
    }
}
