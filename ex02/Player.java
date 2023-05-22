package ex02;

public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    PlayerLevel level;

    Player() {
        level = new BeginnerLevel();
    }

    public void jump() { level.jump(); }

    public void run() { level.run(); }

    public void turn() { level.turn(); }

    public void play(int time) {
        run();
        for(int i = 0; i < time; i++) { jump(); }
        turn();
    }

    public void setLevel(int level) {
        if(level == Player.BEGINNER_LEVEL) {
            this.level = new BeginnerLevel();
        }
        else if(level == Player.ADVANCED_LEVEL) {
            this.level = new AdvancedLevel();
        }
        else if(level == Player.SUPER_LEVEL) {
            this.level = new SuperLevel();
        }
    }
}
