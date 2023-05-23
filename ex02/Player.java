package ex02;

public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    int level;
    LevelState levelState;

    public Player() {
        level = BEGINNER_LEVEL;
        levelState = new BeginnerLevel();
    }

    public void jump() {
        levelState.jump();
    }
    public void run() {
        levelState.run();
    }
    public void turn() {
        levelState.turn();
    }
    public void play(int time) {
        run();
        for(int i =0; i<time; i++) {
            jump();
        }
        turn();
    }
    public void setLevel(int level) {
        this.level = level;
        if(level == BEGINNER_LEVEL){
            levelState = new BeginnerLevel();
        }
        else if (level == ADVANCED_LEVEL)
            levelState = new AdvancedLevel();
        else
            levelState = new SuperLevel();
    }

    public interface LevelState {
        public void run();
        public void jump();
        public void turn();

    }
    public class AdvancedLevel implements LevelState{
        @Override
        public void run() {
            System.out.println("빨리 달립니다.");
        }

        @Override
        public void jump() {
            System.out.println("높이 jump 합니다.");
        }

        @Override
        public void turn() {
            System.out.println("Turn 할 줄 모르지롱.");

        }
    }
    public class BeginnerLevel implements LevelState{
        @Override
        public void run() {
            System.out.println("천천히 달립니다.");
        }

        @Override
        public void jump() {
            System.out.println("Jump 할 줄 모르지롱.");
        }

        @Override
        public void turn() {
            System.out.println("Turn 할 줄 모르지롱.");

        }
    }
    public class SuperLevel implements LevelState {
        @Override
        public void run() {
            System.out.println("엄청 빨리 달립니다.");

        }

        @Override
        public void jump() {
            System.out.println("아주 높이 jump 합니다.");

        }

        @Override
        public void turn() {
            System.out.println("한 바퀴 돕니다.");

        }
    }



}
