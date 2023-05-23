package ex03;

//전략 클래스
public class NotMajorGrade implements Grade{
    private String grade;

    @Override
    public String getGrade(int score) {    //전공인지 비전공인지에 따라 성적 산출 방식 다르게 //Strategy pattern

        if (score >= 90)
            grade = "A";
        else if (score >= 80)
            grade = "B";
        else if (score >= 70)
            grade = "C";
        else if (score >= 55)
            grade = "D";
        else
            grade = "F";

        return grade;
    }
}
