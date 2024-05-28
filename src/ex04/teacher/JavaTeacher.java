package ex04.teacher;

public class JavaTeacher {

    //이렇게 묶는걸 템플릿 메서드 패턴이라고 한다.
    public void 수업하기() {
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }

    private void 입장하기() {
        System.out.println("입장하기");
    }

    private void 출석부르기() {
        System.out.println("출석부르기");
    }

    private void 강의하기() {
        System.out.println("파이썬 강의하기");
    }

    private void 퇴장하기() {
        System.out.println("퇴장하기");
    }
}
