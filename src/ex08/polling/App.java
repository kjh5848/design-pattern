package ex08.polling;

import ex08.push.pub.LotteMart;
import ex08.push.pub.Mart;
import ex08.push.sub.Cus1;
import ex08.push.sub.Cus2;

/**
 * 1. 주기적으로 잘 물어보고
 * 2. 실시간으로 반응하려고!
 * 3. 주기를 잘 정해햐함.
 */

public class App {
    public static void main(String[] args) {
        //1. Bean 로드
        Mart lottetMart = new LotteMart();
        Cus1 cus1 = new Cus1();
        Cus2 cus2 = new Cus2();

        //2. 구독
        lottetMart.add(cus1);
        lottetMart.add(cus2);

        //3. 구독취소
        lottetMart.received();
    }
}
