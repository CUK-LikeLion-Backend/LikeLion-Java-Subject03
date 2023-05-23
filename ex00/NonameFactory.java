package ex00;

public class NonameFactory extends CarFactory {
    @Override
    public MyLittleCar createCar() {
        return new Noname();
    }
}
