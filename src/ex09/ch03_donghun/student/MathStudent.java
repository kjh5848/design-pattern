package ex09.ch03_donghun.student;

public class MathStudent implements Student {
    @Override
    public void doHomework() {
        System.out.println("수학 숙제를 합니다.");
    }

    @Override
    public boolean isHomework(HomeworkType homeworkType) {
        return HomeworkType.MATH.equals(homeworkType);
    }
}
