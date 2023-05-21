package ex03;

public class MajorGrade implements Grade{
    @Override
    public char returnGrade(int score) {
        char grade;
        if(score > 89)
            grade = 'S';
        else if(score > 79)
            grade = 'A';
        else if(score > 69)
            grade = 'B';
        else if(score > 59)
            grade = 'C';
        else
            grade = 'D';

        return grade;
    }
}
