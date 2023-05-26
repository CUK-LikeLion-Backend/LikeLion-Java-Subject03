package ex03;

/**
 * Strategy Pattern으로 전략적으로 성적 매기기
 *
 * strategy pattern
 * 알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해 줍니다.
 * 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있습니다.
 */
public class StudentTest {
    public static void main(String[] args) {
        Grade majorGrade = new MajorGrade();
        Grade notMajorGrade = new NotMajorGrade();

        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100, notMajorGrade);
        studentLee.addSubject("수학", 100, majorGrade);

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("국어", 55, majorGrade);
        studentKim.addSubject("수학", 55, notMajorGrade);
        studentKim.addSubject("영어", 100, notMajorGrade);

        studentLee.showGradeInfo();
        System.out.println("======================================");
        studentKim.showGradeInfo();
    }
}
