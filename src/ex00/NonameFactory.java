package ex00;

public class NonameFactory implements CarFactory{
    MyLittleCar car;

    @Override
    public MyLittleCar produceCar() {
        car = new Noname("noname");

        return car;
    }
}
