package org.design.structural.pattern.bridge1;

public class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS message: " + message);
    }
}
