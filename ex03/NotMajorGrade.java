package ex03;

public class NotMajorGrade implements Grade{
    String grade;
    int score;

    public String MyGrade(int score) {
        if (80 <= score)
            grade = "Perfect";
        else if (60 <= score)
            grade = "Good";
        else if (score < 60)
            grade = "Bad";
        return grade;
    }
}
