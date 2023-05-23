package ex00;

//ConcreteCreator
public class GenesisFactory implements CarFactory{
    MyLittleCar car;

    @Override
    public MyLittleCar produceCar() {
        car = new Genesis(MyLittleCar.GENESIS);

        return car;
    }
}
