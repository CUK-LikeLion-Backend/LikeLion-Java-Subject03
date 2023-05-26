package ex03;

public class MajorGrade implements Grade {
    @Override
    public String calculateGrade(int score) {
        String grade;
        if (score ==100) {
            return "S";}
        else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}