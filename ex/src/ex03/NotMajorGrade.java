package ex03;

public class NotMajorGrade implements GradeStrategy{
    @Override
    public String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if(score>=55) {
            return "D";
        } else {
            return "F";
        }
    }
}
