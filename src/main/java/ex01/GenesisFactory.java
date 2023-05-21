package ex01;

public class GenesisFactory implements CarFactory {
    private static GenesisFactory instance;
    private GenesisFactory(){}

    public static GenesisFactory getInstance(){
        if(instance==null){
            instance = new GenesisFactory();
            return instance;
        }
        else{
            return instance;
        }
    }

    @Override
    public MyLittleCar makeCar() {
        MyLittleCar car = new Genesis(MyLittleCar.GENESIS);
        return car;
    }
}
