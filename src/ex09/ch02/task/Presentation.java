package ex09.ch02.task;

import ex09.ch02.Task;

public class Presentation implements Task {
    @Override
    public void performTask() {
        System.out.println("학생이 발표를 준비하고 있습니다.");
    }
}
