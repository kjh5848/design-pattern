package ex09.ch03_donghun.student;

public class ScienceStudent implements Student {
    @Override
    public void doHomework() {
        System.out.println("과학 숙제를 합니다.");
    }

    @Override
    public boolean isHomework(HomeworkType homeworkType) {
        return HomeworkType.SCIENCE.equals(homeworkType);
    }
}
