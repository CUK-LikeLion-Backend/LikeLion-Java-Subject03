package ex00;

public class GrandeurFactory implements CarFactory{
    MyLittleCar car;

    @Override
    public MyLittleCar produceCar() {
        car = new Grandeur(MyLittleCar.GRANDEUR);

        return car;
    }
}
