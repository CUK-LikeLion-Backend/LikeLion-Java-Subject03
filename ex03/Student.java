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

    public void addSubject(String name, int scorePoint, Grade grade) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(scorePoint);
        subject.setGrade(grade);
        subjectList.add(subject);
    }

    public void showGradeInfo() {
        for(Subject subject : subjectList) {
            String grade = subject.getGrade().getGrade(subject.getScorePoint());
            System.out.println("학생 " + studentName + "의 " + subject.getName() + " 과목 성적은 " + subject.getScorePoint() + "이고, 학점은 " + grade + "입니다.");
        }
    }
}
