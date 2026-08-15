package org.design.structural.pattern.bridge1;

public class AlertNotification extends Notification {

    public AlertNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    void notifyUser(String message) {
        System.out.print("Alert Notification: ");
        messageSender.sendMessage(message);
    }
}
