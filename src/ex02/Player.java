package ex02;

public class Player {
    private Level level;

    public Player(){
        level = new Beginner();
    }

    public void play(int time) {
        level.run();
        for(int i =0; i<time; i++) {
            level.jump();
        }
        level.turn();
    }

    public void setLevel(Level level) { //상태 클래스(레벨)를 받아 해당 값으로 상태 설정
        this.level = level;
    }

}
