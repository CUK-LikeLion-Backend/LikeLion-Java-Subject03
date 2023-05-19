package ex01;

public class GrandeurFactory implements CarFactory {
    final private static GrandeurFactory factory = new GrandeurFactory();
    private GrandeurFactory() {}

    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = null;
        car = new Grandeur(MyLittleCar.GRANDEUR);
        return car;
    }

    public static GrandeurFactory getFactory() {
        return factory;
    }
}
