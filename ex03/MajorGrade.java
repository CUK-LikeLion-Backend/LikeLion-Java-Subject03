package ex03;

public class MajorGrade extends Grade{
    @Override
    String Score(int ScorePoint) {
        if(ScorePoint >= 95)
            return "S";
        else if (ScorePoint >= 90) {
            return "A";
        }
        else if (ScorePoint >= 80) {
            return "B";
        }else if (ScorePoint >= 70) {
            return "C";
        }else if (ScorePoint >= 60) {
            return "D";
        }
        else
            return "F";
    }
}
