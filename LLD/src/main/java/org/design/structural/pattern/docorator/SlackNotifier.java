package org.design.structural.pattern.docorator;

public class SlackNotifier extends NotifierDecorator {
    public SlackNotifier(Notifier wrapper) {
        super(wrapper);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlackMessage(message);
    }

    private void sendSlackMessage(String message) {
        System.out.println("Sending Slack notification with message: " + message);
    }
}
