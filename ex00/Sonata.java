package ex00;

public class Sonata extends CarFactory {
    private String name;
    private String color;
    private String carNumber;
    Sonata() {
        super("Sonata");
    }

    public void run() {
        turnOffEngine();
        turnOnEngine();
        speedUp();
        speedUp();
        speedDown();
        speedDown();
        speedDown();
        turnOffEngine();
    }
}
