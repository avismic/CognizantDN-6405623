package com.example.decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        String msg = "System alert: CPU usage high";

        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send(msg);
        System.out.println("---");

        Notifier emailAndSms = new SMSNotifierDecorator(new EmailNotifier());
        emailAndSms.send(msg);
        System.out.println("---");

        Notifier emailAndSlack = new SlackNotifierDecorator(new EmailNotifier());
        emailAndSlack.send(msg);
        System.out.println("---");

        Notifier allChannels = new SlackNotifierDecorator(
                                  new SMSNotifierDecorator(
                                    new EmailNotifier()));
        allChannels.send(msg);
    }
}
