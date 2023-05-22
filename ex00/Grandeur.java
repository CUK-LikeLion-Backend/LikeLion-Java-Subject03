package ex00;

public class Grandeur extends CarFactory {
    private String name;

    Grandeur() {
        super("Grandeur");
    }

    public void run() {
        turnOnEngine();
        speedUp();
        speedUp();
        speedUp();
        speedUp();
        drive();
        speedDown();
        speedDown();
        speedDown();
        drive();
        stop();
        refuel(90);
        turnOffEngine();
    }
}
