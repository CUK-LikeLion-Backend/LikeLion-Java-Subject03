package ex03;

public class MajorGrade extends Grade {
    private String grade;
    public String getGrade(int scorePoint) {
        int score = scorePoint / 10;
        switch(score) {
            case 10 :
            case 9 : grade = "A"; break;
            case 8 : grade = "B"; break;
            case 7 : grade = "C"; break;
            case 6 : grade = "D"; break;
            default : grade = "F"; break;
        }
        return grade;
    }
}
