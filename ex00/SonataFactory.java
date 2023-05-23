package ex00;

public class SonataFactory extends CarFactory{
    @Override
    public MyLittleCar createCar() {
        return new Sonata();
    }
}