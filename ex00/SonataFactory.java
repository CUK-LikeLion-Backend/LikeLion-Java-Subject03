package ex00;

public class SonataFactory implements CarFactory{

    @Override
    public MyLittleCar produceCar() {
        return new MyLittleCar(MyLittleCar.SONATA);
    }
}
