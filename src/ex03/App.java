package ex03;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();

        Animal mouse = new Mouse();
        Animal tiger = new Tiger();

        doorman.쫒아내(tiger);



    }
}
