package polling;

public class App {
    public static void main(String[] args) {

        Doorman doorman = Doorman.instance;

        Animal mouse = new Mouse();
        Animal tiger = new Tiger();

        doorman.쫒아내(tiger);



    }
}
