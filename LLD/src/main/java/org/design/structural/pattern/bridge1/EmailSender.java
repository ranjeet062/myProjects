package org.design.structural.pattern.bridge1;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email Message Sent: " + message);
    }
}
