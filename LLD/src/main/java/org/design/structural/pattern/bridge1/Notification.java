package org.design.structural.pattern.bridge1;

public abstract class Notification {
    protected MessageSender messageSender;

    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract void notifyUser(String message);
}
