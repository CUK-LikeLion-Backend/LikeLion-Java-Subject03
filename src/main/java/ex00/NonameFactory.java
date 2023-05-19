package ex00;

public class NonameFactory implements CarFactory {
    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = null;
        car = new Noname("noname");
        return car;
    }
}

