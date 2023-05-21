package ex00;

public class GrandeurFactory implements CarFactory{
    public GrandeurFactory(){}

    @Override
    public MyLittleCar makeCar() {
        MyLittleCar car = new Grandeur(MyLittleCar.GRANDEUR);
        return car;
    }
}
