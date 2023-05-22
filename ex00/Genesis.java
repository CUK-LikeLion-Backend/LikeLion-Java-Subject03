package ex00;

public class Genesis extends CarFactory {
    private String name;

    Grandeur() {
        super("Genesis");
    }

    public void run() {
        turnOnEngine();
        speedUp();
        speedUp();
        speedUp();
        speedUp();
        drive();
        speedDown();
        drive();
        stop();
        refuel(50);
        turnOffEngine();
    }
}