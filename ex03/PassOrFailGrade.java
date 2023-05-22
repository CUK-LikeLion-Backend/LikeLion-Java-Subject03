package ex03;

public class PassOrFailGrade extends Grade {
    private String grade;
    public String getGrade(int scorePoint) {
        int score = scorePoint / 10;
        switch(score) {
            case 10 :
            case 9 :
            case 8 :
            case 7 :
            case 6 :
            case 5 : grade = "P"; break;
            default : grade = "F"; break;
        }
        return grade;
    }
}
