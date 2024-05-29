package ex09.ch02.task;

import ex09.ch02.Task;

public class Homework implements Task {
    @Override
    public void performTask() {
        System.out.println("학생이 숙제를 하고 있습니다.");
    }
}
