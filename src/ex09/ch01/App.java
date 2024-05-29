package ex09.ch01;

public class App {
    public static void main(String[] args) {
        Task student = new Student();
        Teacher teacher = new Teacher(student);
        teacher.assignTask();
    }
}
