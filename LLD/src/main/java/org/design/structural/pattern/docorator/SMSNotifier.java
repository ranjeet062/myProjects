package org.design.structural.pattern.docorator;

public class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier wrapper) {
        super(wrapper);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS notification with message: " + message);
    }
}
