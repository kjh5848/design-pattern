package ex00;

/**
 * 목표: 다형성, 동적바인딩
 * 1. 소나타, 제네시스 == 자동차
 */

abstract class Car {
    abstract void run();
}

class Sonata extends Car {
    @Override
    void run() {
        System.out.println("소나타 달린다.");
    }
}

class Genesis extends Car {
    @Override
    void run() {
        System.out.println("제네시스 달린다.");
    }
}

public class Mem02{
    public static void main(String[] args) {
        Car s = new Sonata();
        //car의 run을 호출하러 갖더니, sonata가 run을 재정의 해서
        //car의 rnun의 오버라이드(무효화)되고, sonata의 run이 호출된다.
        s.run();
        Car g = new Genesis();
        g.run();
    }
}
