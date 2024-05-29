package ex09.ch02.task;

import ex09.ch02.Task;

public class ScienceExperiment implements Task {
    @Override
    public void performTask() {
        System.out.println("학생이 과학 실험을 준비하고 있습니다.");
    }
}
