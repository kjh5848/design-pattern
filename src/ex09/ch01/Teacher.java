package ex09.ch01;

public class Teacher {
    private Task task;

    public Teacher(Task task) {
        this.task = task;
    }

    public void assignTask() {
        task.performTask();
    }
}
