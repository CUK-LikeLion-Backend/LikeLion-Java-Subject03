package ex01;

public class GenesisFactory implements CarFactory {
    final private static GenesisFactory factory = new GenesisFactory();
    private GenesisFactory() {}

    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = null;
        car = new Genesis(MyLittleCar.GENESIS);
        return car;
    }

    public static GenesisFactory getFactory() {
        return factory;
    }
}
