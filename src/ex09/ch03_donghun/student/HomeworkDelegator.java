package ex09.ch03_donghun.student;

import java.util.ArrayList;
import java.util.List;

public class HomeworkDelegator {
    private final List<Student> students = new ArrayList<>();

    public HomeworkDelegator() {
        students.add(new MathStudent());
        students.add(new ScienceStudent());
        students.add(new HistoryStudent());
    }

    public void delegatorHomework(HomeworkType homeworkType) {
        students.stream()
                .filter(student -> student.isHomework(homeworkType))
                .forEach(student -> student.doHomework());
    }
}
