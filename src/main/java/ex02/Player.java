package ex02;

public class Player {

    private LevelState level = null;

    public Player() {
        level = new BeginnerLevel();
    }

    public LevelState getLevel() {
        return level;
    }

    public void play(int time) {
        level.run();
        for(int i =0; i<time; i++) {
            level.jump();
        }
        level.turn();
    }

    public void setLevel(LevelState level) {
        this.level = level;
    }
}
