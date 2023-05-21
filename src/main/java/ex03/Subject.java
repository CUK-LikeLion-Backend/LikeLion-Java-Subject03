package ex03;

public class Subject {
    private String name;
    private int scorePoint;
    private Grade majorCode;

    private char grade;

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

    public void setMajorCode(Grade majorCode) {
        this.majorCode = majorCode;
    }

    public void setGrade() {
        grade = majorCode.returnGrade(scorePoint);
    }

    public char getGrade(){
        return grade;
    }


}