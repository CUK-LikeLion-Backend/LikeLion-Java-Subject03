package ex00;

public class CarFactory {
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";

    public static MyLittleCar produceCar(String name) {
        if (name.equalsIgnoreCase(SONATA)) {
            return new Sonata();
        } else if (name.equalsIgnoreCase(GRANDEUR)) {
            return new Grandeur();
        } else if (name.equalsIgnoreCase(GENESIS)) {
            return new Genesis();
        } else {
            return new Noname();
        }
    }
}