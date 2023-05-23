package ex03;

public class Subject{
    private String name;
    private int scorePoint;
    private Grade majorCode;
    private Grade grade;

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
    public Grade isMajorCode() {
        return majorCode;
    }
    public void setMajorCode(Grade majorCode) {
        this.majorCode = majorCode;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    //학점반환
    public String getGrade(){
        return grade.MyGrade(scorePoint);
    }
}
