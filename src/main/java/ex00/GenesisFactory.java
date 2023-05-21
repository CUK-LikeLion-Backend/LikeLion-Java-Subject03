package ex00;

public class GenesisFactory implements CarFactory {
    public GenesisFactory(){}

    @Override
    public MyLittleCar makeCar() {
        MyLittleCar car = new Genesis(MyLittleCar.GENESIS);
        return car;
    }
}
