package ex09.ch02;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private List<Student> studentList = new ArrayList<Student>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void assingTask(Task task) {
        for (Student student : studentList) {
            student.doTask(task);
        }
    }
}
