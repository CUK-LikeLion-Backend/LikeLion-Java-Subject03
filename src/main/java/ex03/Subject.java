package ex03;

public class Subject {
    private String name;
    private int scorePoint;
    private Grade grader;

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
    public Grade getGrader() {
        return this.grader;
    }
    public void setGrader(Grade grader) {
        this.grader = grader;
    }
}
