package ex02;

public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
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
        if (level == BEGINNER_LEVEL) {
            state = new BeginnerState();
        } else if (level == ADVANCED_LEVEL) {
            state = new AdvancedState();
        } else if (level == SUPER_LEVEL) {
            state = new SuperState();
        } else {
            throw new IllegalArgumentException("유효하지 않은 레벨입니다.");
        }
    }
}
