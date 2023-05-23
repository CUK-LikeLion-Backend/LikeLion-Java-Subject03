package ex03;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;
    public static final int BASIC = 0;
    public static final int MAJOR = 1;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score, Grade grade) { //"국어", 100, notMajorGrade
        Subject subject = new Subject();    //과목 객체 생성

        subject.setName(name);  //과목명
        subject.setScorePoint(score);   //과목 점수
        subject.setGrade(grade.getGrade(score));    //받아온 majorGrade(과목 유형)의 등급
        subjectList.add(subject);   //과목 목록에 과목 객체 추가
    }

    public void showGradeInfo() {   //성적 출력

        for (Subject subject : subjectList) {
            System.out.print("학생 "+studentName+"의 ");
            System.out.print(subject.getName() + " 과목 성적 : " + subject.getScorePoint()+", ");
            System.out.print("학점 : "+subject.getGrade());
            System.out.println();

        }

    }
}
