package ex03;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score, Grade grade) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subject.setGrade(grade);
        subjectList.add(subject);
    }

    public void showGradeInfo() {
        for (Subject subject : subjectList) {
            System.out.println("과목: " + subject.getName());
            System.out.println("성적: " + subject.getScorePoint());
            System.out.println("학점: " + subject.getGrade().calculateGrade(subject.getScorePoint()));
            System.out.println("===============================");
        }
    }
}
