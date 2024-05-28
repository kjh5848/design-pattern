package ex03;

import ex03.lib.OuterRabbit;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();

        Animal rabbit = new RabbitAdapter(new OuterRabbit());

        doorman.쫒아내(rabbit);



    }
}
