package ex01;

import ex00.MyLittleCar;

public class Sonata extends MyLittleCar {
    private static Sonata instance;

    private Sonata(){
        super("Sonata");
    }

    public static Sonata getFactory() {
        if (instance == null) {
            instance = new Sonata();
        }
        return instance;
    }
}
