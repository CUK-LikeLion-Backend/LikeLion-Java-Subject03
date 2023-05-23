package ex00;

public class GenesisFactory implements CarFactory{

    @Override
    public MyLittleCar produceCar() {
        return new MyLittleCar(MyLittleCar.GENESIS);
    }
}
