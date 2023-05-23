package ex03;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score, Grade grade){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subject.setGrade(grade);
        subjectList.add(subject);
    }

    public void showGradeInfo() {
        for (Subject subject : subjectList) {
            System.out.printf("학생 %s의 %s 과목 성적은 %d점 이고, 학점은 %s 입니다.\n",
                    studentName, subject.getName(), subject.getScorePoint(), subject.getGrade());
        }
    }
}
