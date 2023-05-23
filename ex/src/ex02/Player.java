package ex02;

public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    private State state;
    int level;

    public Player(){
        state=new Beginner();
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
            state = new Beginner();
        } else if (level == Player.ADVANCED_LEVEL) {
            state = new Advanced();
        } else if (level == Player.SUPER_LEVEL) {
            state = new Super();
        }
    }

}
