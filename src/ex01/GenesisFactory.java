package ex01;

import ex00.CarFactory;
import ex00.MyLittleCar;
import ex00.Sonata;

//ConcreteCreator
public class GenesisFactory implements CarFactory {
    private static GenesisFactory factory;

    public GenesisFactory(){

    }
    public static GenesisFactory getInstance(){
        if(factory == null){
            factory = new GenesisFactory();
        }

        return factory;
    }

    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = new Genesis(MyLittleCar.GENESIS);

        return car;
    }

}
