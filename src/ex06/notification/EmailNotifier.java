package ex06.notification;

public class EmailNotifier implements Notifier {
    private Notifier notifier;

    public EmailNotifier() {
    }

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send() {
        if (notifier != null) notifier.send();
        System.out.println("이메일 알림");
    }
}
