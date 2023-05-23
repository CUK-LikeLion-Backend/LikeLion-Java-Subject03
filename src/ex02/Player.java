package ex02;

public class Player {

    private static State state;


    public void jump() {
        state.jump();
    }
    public void run(){
        state.run();
    }
    public void turn(){
        state.turn();
    }
    public void play(int time) {
        run();
        for (int i = 0; i < time; i++) {
            jump();
        }
        turn();
    }

    public void setLevel(State state) {
        this.state = state;
    }
}