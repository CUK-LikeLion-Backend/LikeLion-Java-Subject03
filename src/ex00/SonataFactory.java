package ex00;

public class SonataFactory implements CarFactory{
    MyLittleCar car;

    @Override
    public MyLittleCar produceCar() {
        car = new Sonata(MyLittleCar.SONATA);

        return car;
    }
}
