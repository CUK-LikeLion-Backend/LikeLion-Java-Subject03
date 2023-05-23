package ex03;

public class Subject {
    private String name;
    private int score;
    private GradeStrategy gradeStrategy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public GradeStrategy getGrade() {
        return gradeStrategy;
    }

    public void setGrade(GradeStrategy gradeStrategy) {
        this.gradeStrategy = gradeStrategy;
    }
}
