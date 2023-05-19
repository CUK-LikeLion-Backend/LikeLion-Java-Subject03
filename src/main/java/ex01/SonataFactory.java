package ex01;

public class SonataFactory implements CarFactory {
    final private static SonataFactory factory = new SonataFactory();
    private SonataFactory() {}

    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = null;
        car = new Sonata(MyLittleCar.SONATA);
        return car;
    }

    public static SonataFactory getFactory() {
        return factory;
    }
}
