package ex03;

public class NotMajorGrade extends Grade {
    @Override
    String Score(int ScorePoint) {
        if (ScorePoint >= 80)
            return "A";
        else if (ScorePoint >= 70)
            return "B";
        else if (ScorePoint >= 60)
            return "C";
        else if (ScorePoint >= 50)
            return "D";
        else
            return "F";

    }
}