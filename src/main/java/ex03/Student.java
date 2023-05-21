package ex03;

import java.util.ArrayList;

//컨텍스트
public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score, Grade majorCode) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subject.setMajorCode(majorCode);
        subject.setGrade();
        subjectList.add(subject);
    }

    public void showGradeInfo() {
        for(Subject subject:subjectList){
            System.out.print("학생 " + studentName + "의 " + subject.getName() + " 과목 성적은");
            System.out.println(subject.getScorePoint()+ "점 이고, 학점은 " + subject.getGrade() + " 입니다.");
        }
    }

}