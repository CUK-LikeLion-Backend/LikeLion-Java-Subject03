package ex00;

public class Noname extends CarFactory {
    private String name;
    Noname() {
        super("noname");
    }

    public void run() {
        turnOnEngine();
        turnOffEngine();
    }
}
