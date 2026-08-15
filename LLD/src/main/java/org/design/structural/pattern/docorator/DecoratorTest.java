package org.design.structural.pattern.docorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier slackNotifier = new SlackNotifier(emailNotifier);
        Notifier smsNotifier = new SMSNotifier(slackNotifier);
        smsNotifier.send("Hello, this is a test notification!");
    }
}
