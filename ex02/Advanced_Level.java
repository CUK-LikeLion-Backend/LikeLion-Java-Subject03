package ex02;

public class Advanced_Level implements LevelState{
    public Advanced_Level() {
    }
    public void jump() {
        System.out.println("높이 jump 합니다.");
    }
    public void run() {
        System.out.println("빨리 달립니다.");
    }
    public void turn() {
        System.out.println("Turn 할 줄 거의 모르지롱.");
    }
}