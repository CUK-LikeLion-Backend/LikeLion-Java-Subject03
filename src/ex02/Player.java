package ex02;

public class Player {

    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    int level;
    private State state;

    public Player() {
        state = new BeginnerState();
    }

    public void jump() {
        state.jump();
    }

    public void run() {
        state.run();
    }

    public void turn() {
        state.turn();
    }

    public void play(int time) {
        run();
        for (int i = 0; i < time; i++) {
            jump();
        }
        turn();
    }

    public void setLevel(int level) {
        if (level == Player.BEGINNER_LEVEL) {
            state = new BeginnerState();
        } else if (level == Player.ADVANCED_LEVEL) {
            state = new AdvancedState();
        } else if (level == Player.SUPER_LEVEL) {
            state = new SuperState();
        }
    }
}