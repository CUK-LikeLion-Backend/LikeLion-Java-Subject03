package ex03;

public class Subject {
    private String name;
    private int scorePoint;
    private Grade gradePolicy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }

    public Grade getGradePolicy() {
        return gradePolicy;
    }

    public void setGradePolicy(Grade gradePolicy) {
        this.gradePolicy = gradePolicy;
    }

    public String calculateGrade() {
        return gradePolicy.calculateGrade(scorePoint);
    }
}
