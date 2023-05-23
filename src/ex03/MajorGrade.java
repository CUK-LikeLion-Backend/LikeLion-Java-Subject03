package ex03;

//전략 클래스
public class MajorGrade implements Grade{
    private String grade;

    @Override
    public String getGrade(int score) {

        if (score >= 95)
            grade = "S";
        else if (score >= 90)
            grade = "A";
        else if (score >= 80)
            grade = "B";
        else if (score >= 70)
            grade = "C";
        else if (score >= 60)
            grade = "D";
        else
            grade = "F";
        return grade;
    }
}
