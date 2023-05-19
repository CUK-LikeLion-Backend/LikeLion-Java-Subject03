package ex00;

public class GenesisFactory implements CarFactory {
    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = null;
        car = new Genesis(MyLittleCar.GENESIS);
        return car;
    }
}
