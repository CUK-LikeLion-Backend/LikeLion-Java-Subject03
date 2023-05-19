package ex01;

public class NonameFactory implements CarFactory {
    final private static NonameFactory factory = new NonameFactory();
    private NonameFactory() {}

    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = null;
        car = new Noname("noname");
        return car;
    }

    public static NonameFactory getFactory() {
        return factory;
    }
}

