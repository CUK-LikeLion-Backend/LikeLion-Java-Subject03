package ex00;

public class GrandeurFactory extends CarFactory {
    public MyLittleCar createCar() {
        return new Grandeur();
    }
}
