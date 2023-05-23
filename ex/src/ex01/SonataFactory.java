package ex01;

public class SonataFactory extends MyLittleCar {
    private static SonataFactory sonataFactory;

    private SonataFactory() {
    }

    public static SonataFactory getFactory() {
        if (sonataFactory == null) {
            sonataFactory = new SonataFactory();
        }
        return sonataFactory;
    }

    public String getName() {
        return "Sonata";
    }
}
