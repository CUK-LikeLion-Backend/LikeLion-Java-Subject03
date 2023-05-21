package ex00;

public class SonataFactory implements CarFactory{
    public SonataFactory(){}

    @Override
    public MyLittleCar makeCar() {
        MyLittleCar car = new Sonata(MyLittleCar.SONATA);
        return car;
    }
}
