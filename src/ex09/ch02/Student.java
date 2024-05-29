package ex09.ch02;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void doTask(Task task) {
        System.out.println(name + ": 작업을 시작하고 있습니다.");
        task.performTask();
    }

}
