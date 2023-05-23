package ex03;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;
    public static final int BASIC = 0;
    public static final int MAJOR = 1;

    GradeStrategy majorGrade;
    GradeStrategy notMajorGrade;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();

        majorGrade = new MajorGrade();
        notMajorGrade = new NotMajorGrade();
    }

    public void addSubject(String name, int score, GradeStrategy gradeStrategy) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subject.setGrade(gradeStrategy);
        subjectList.add(subject);
    }

    public void showGradeInfo() {

        for (Subject subject : subjectList) {
            System.out.println("학생 "+studentName+"의 "+subject.getName()+" 과목 성적은 "+subject.getScore()
            +"점 이고, 학점은 "+ subject.getGrade().getGrade(subject.getScore()) +"입니다.");
        }
    }

}
