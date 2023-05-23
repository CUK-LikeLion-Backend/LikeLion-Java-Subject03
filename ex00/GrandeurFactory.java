package ex00;

public class GrandeurFactory implements CarFactory{

    @Override
    public MyLittleCar produceCar() {
        return new MyLittleCar(MyLittleCar.GRANDEUR);
    }
}
