package ex02;

interface PlayerState{ //캡슐화
    void jump();
    void run();
    void turn();
}

class BeginnerState implements PlayerState{ // 각자 할 수 있는 것들을 정의
    @Override
    public void jump(){
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void run(){
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void turn(){
        System.out.println("Turn 할 줄 모르지롱.");
    }
}

class AdvancedState implements PlayerState{
    @Override
    public void jump(){
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void run(){
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void turn(){
        System.out.println("Turn 할 줄 모르지롱.");
    }
}

class SuperState implements PlayerState{
    @Override
    public void jump(){
        System.out.println("아주 높이 Jump 합니다.");
    }

    @Override
    public void run(){
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void turn(){
        System.out.println("한 바퀴 돕니다.");
    }
}
public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    int level;

        private PlayerState state;

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
            switch (level) {
                case BEGINNER_LEVEL:
                    state = new BeginnerState();
                    break;
                case ADVANCED_LEVEL:
                    state = new AdvancedState();
                    break;
                case SUPER_LEVEL:
                    state = new SuperState();
                    break;
            }
        }

    }
