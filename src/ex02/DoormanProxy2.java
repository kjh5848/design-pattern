package ex02;

import javax.swing.*;


public class DoormanProxy2 {

    private final Doorman doorman;

    public DoormanProxy2(Doorman doorman) {
        this.doorman = doorman;
    }

    public void 쫓아내(Animal animal) {
        System.out.println("지갑검사");
        doorman.쫓아내(animal);
    }
}
