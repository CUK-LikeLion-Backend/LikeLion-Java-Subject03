package ex03;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score, Grade grader){
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScorePoint(score);
        subject.setGrader(grader);
        subjectList.add(subject);
    }

    public void showGradeInfo() {
        for (int i=0; i<subjectList.size(); ++i) {
            Subject subject = subjectList.get(i);

            System.out.print("학생 "+studentName+"의 ");
            System.out.print(subject.getName());
            System.out.print(" 과목 성적은 ");
            System.out.print(subject.getScorePoint());
            System.out.print("점 이고, 학점은 ");
            System.out.print(subject.getGrader().grading(subject));
            System.out.println(" 입니다.");
        }
    }
}
