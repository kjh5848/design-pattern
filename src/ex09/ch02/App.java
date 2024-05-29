package ex09.ch02;

import ex09.ch02.task.Homework;
import ex09.ch02.task.Presentation;
import ex09.ch02.task.ScienceExperiment;

public class App {
    public static void main(String[] args) {
        //학생 생성
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        //과제생성
        Task scienceExperiment = new ScienceExperiment();
        Task homework = new Homework();
        Task presentation = new Presentation();

        //선생님 생성 및 학생 추가
        Teacher teacher = new Teacher();
        teacher.addStudent(student1);
        teacher.addStudent(student2);

        //과제 추가
        teacher.assingTask(scienceExperiment);
        teacher.assingTask(homework);
        teacher.assingTask(presentation);
    }
}
