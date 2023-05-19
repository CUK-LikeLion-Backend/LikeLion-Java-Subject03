package ex00;

public class GrandeurFactory implements CarFactory {
    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = null;
        car = new Grandeur(MyLittleCar.GRANDEUR);
        return car;
    }
}
