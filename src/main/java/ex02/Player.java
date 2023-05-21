package ex02;


public class Player {
    private final Level beginnerLevel;
    private final Level advancedLevel;

    private final Level superLevel;
    private Level currentLevel;

    public Player() {
        beginnerLevel = new BeginnerLevel();
        advancedLevel = new AdvancedLevel();
        superLevel = new SuperLevel();

        currentLevel = beginnerLevel;
    }

    public void jump() {
        currentLevel.jump();
    }
    public void run() {
        currentLevel.run();
    }
    public void turn() {
        currentLevel.turn();
    }

    public void play(int time) {
        run();
        for(int i =0; i<time; i++) {
            jump();
        }
        turn();
    }

    public void setLevel(Level level) {
        this.currentLevel = level;
    }

    public Level getBeginnerLevel() {
        return beginnerLevel;
    }

    public Level getAdvancedLevel() {
        return advancedLevel;
    }

    public Level getSuperLevel() {
        return superLevel;
    }
}