package ex03;

public class NotMajorGrade implements Grade{
    @Override
    public char returnGrade(int score) {
        char grade;
        if(score > 89)
            grade = 'A';
        else if(score > 79)
            grade = 'B';
        else if(score > 69)
            grade = 'C';
        else if(score > 59)
            grade = 'D';
        else
            grade = 'F';

        return grade;
    }
}
