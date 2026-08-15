package org.design.structural.pattern.bridge1;

public class BridgeTest {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        Notification alertNotification = new AlertNotification(emailSender);
        alertNotification.notifyUser("Hello via Email!");

        MessageSender smsSender = new SMSSender();
        Notification smsNotification = new AlertNotification(smsSender);
        smsNotification.notifyUser("Hello via SMS!");

        Notification reportEmailNotification = new ReportNotification(emailSender);
        reportEmailNotification.notifyUser("Report via Email!");

        Notification reportSmsNotification = new ReportNotification(smsSender);
        reportSmsNotification.notifyUser("Report via SMS!");
    }
}
