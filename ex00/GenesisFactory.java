package ex00;

public class GenesisFactory extends CarFactory {

    @Override
    public MyLittleCar createCar() {
        return new Genesis();
    }
}
