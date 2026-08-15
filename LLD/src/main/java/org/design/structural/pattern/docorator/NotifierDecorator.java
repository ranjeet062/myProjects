package org.design.structural.pattern.docorator;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrapper;

    public NotifierDecorator(Notifier wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void send(String message) {
        wrapper.send(message);
    }
}
