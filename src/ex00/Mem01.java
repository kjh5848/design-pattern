package ex00;

/**
 * 1. JVM은 static 키워드가 붙은 친구들을 static 메모리에 로드한다.
 * 2. JVM은 static 메모리에서 main 메섣를 찾아서 실행한다.
 * 3. JVM의 생명주기는 main 메서드의 코드 줄(Queue)
 * 4. Heap 동적 메모리 할당
 */
class Animal {
    String name = "강아지";

    void speak() {
        String sound = "멍멍";
        System.out.println("sound = " + sound);
    }
}


public class Mem01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        System.out.println("animal.name = " + animal.name);
    }
}
