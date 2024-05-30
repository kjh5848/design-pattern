package ex09.ch03_donghun.student;

public class HistoryStudent implements Student {
    @Override
    public void doHomework() {
        System.out.println("역사 숙제를 합니다.");
    }

    @Override
    public boolean isHomework(HomeworkType homeworkType) {
        return HomeworkType.HISTORY.equals(homeworkType);
    }
}
