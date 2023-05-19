package ex00;

public class SonataFactory implements CarFactory {
    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = null;
        car = new Sonata(MyLittleCar.SONATA);
        return car;
    }
}
