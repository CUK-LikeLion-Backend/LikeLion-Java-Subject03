package ex03;

public class StudentTest {
    public static void main(String[] args) {
        /**
         * 객체들이 할 수 있는 행위 각각에 대해 전략 클래스를 생성하고,
         * 유사한 행위들을 캡슐화 하는 인터페이스를 정의하여,
         * 객체의 행위를 동적으로 바꾸고 싶은 경우 직접 행위를 수정하지 않고
         * 전략을 바꿔주기만 함으로써 행위를 유연하게 확장하는 방법
         *
         * 간단히 말해서 객체가 할 수 있는 행위들 각각을 전략으로 만들어 놓고
         * 동적으로 행위의 수정이 필요한 경우 전략을 바꾸는 것만으로 행위의 수정이 가능하도록 만든 패턴
         */
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100, new NotMajorGrade());
        studentLee.addSubject("수학", 100, new MajorGrade());

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("국어", 55, new MajorGrade());
        studentKim.addSubject("수학", 55, new NotMajorGrade());
        studentKim.addSubject("영어", 100, new NotMajorGrade());

         studentLee.showGradeInfo();
        System.out.println("======================================");
        studentKim.showGradeInfo();
    }

}