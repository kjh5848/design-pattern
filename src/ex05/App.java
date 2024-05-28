package ex05;

import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;

public class App {
    public static void main(String[] args) {
        Teacher jt = new JavaTeacher();
        Teacher pt = new PythonTeacher();
        jt.수업하기();
        System.out.println("========");
        pt.강의하기();
    }
}
