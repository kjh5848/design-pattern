package ex02;

public class App {
    public static void main(String[] args) {
        DoormanProxy2 doorman = new DoormanProxy2(new Doorman());

        Animal mouse = new Mouse();
        Animal tiger = new Tiger();

        doorman.쫓아내(mouse);



    }
}
