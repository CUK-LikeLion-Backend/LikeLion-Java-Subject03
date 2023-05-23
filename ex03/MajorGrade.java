package ex03;

public class MajorGrade implements Grade{
    String grade;
    int score;

    public String MyGrade(int score){
        if (90 <= score)
            grade = "A";
        else if (80 <= score)
            grade = "B";
        else if (70 <= score)
            grade = "C";
        else if (60 <= score)
            grade = "D";
        else if (score < 60)
            grade = "F";
        return grade;
    }
}
