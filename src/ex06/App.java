package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SmsNotifier;

/**
 * 목표: 기능확장(데코레이터 패턴)  -> 알림서비스 개발하기
 */
public class App {
    public static void main(String[] args) {

        System.out.println("no1---------------------------");
        Notifier no1 = new EmailNotifier(new BasicNotifier());
        no1.send();

        System.out.println("no2---------------------------");
        Notifier no2 = new SmsNotifier(new BasicNotifier());
        no2.send();

        System.out.println("no3---------------------------");
        Notifier no3 = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        no3.send();

        //이메일은 의존하고 있기 때문에 안에 디폴트 생성자를 만들어준다.
        System.out.println("no4---------------------------");
        Notifier no4 = new SmsNotifier();
        no4.send();


        System.out.println("---------------------선생님 코드----------------");

        // 1. 전체 알림 (기본알림 -> 문자알림 -> 이메일알림)
        Notifier allNotifier = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        allNotifier.send();
        System.out.println("__end");

        // 2. 전체 알림 (기본알림 -> 이메일알림 -> 문자알림)
        Notifier allNotifier2 = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        allNotifier2.send();
        System.out.println("__end");

        // 3. 전체 알림 (기본알림 -> ~~~~~~~~)
        Notifier allNotifier3 = new SmsNotifier(new EmailNotifier(new EmailNotifier(new BasicNotifier())));
        allNotifier3.send();
        System.out.println("__end");

        // 4. 기본 알림
        Notifier basicNotifier = new BasicNotifier();
        basicNotifier.send();
        System.out.println("__end");

        // 5. 기본 알림 + 문자 알림
        Notifier smsNotifier = new SmsNotifier(new BasicNotifier());
        smsNotifier.send();
        System.out.println("__end");

        // 6. 기본 알림 + 이메일 알림
        Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
        emailNotifier.send();
        System.out.println("__end");

        // 7. 이메일 알림
        Notifier onlyEmailNotifier = new EmailNotifier();
        onlyEmailNotifier.send();
        System.out.println("__end");

        // 8. 문자 알림
        Notifier onlySmsNotifier = new SmsNotifier();
        onlySmsNotifier.send();
        System.out.println("__end");

        // 9. 문자알림 + 이메일알림
        Notifier smsAndEmailNotifier = new EmailNotifier(new SmsNotifier());
        smsAndEmailNotifier.send();
        System.out.println("__end");


    }
}
