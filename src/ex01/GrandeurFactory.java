package ex01;

import ex00.CarFactory;
import ex00.MyLittleCar;
import ex00.Sonata;

public class GrandeurFactory implements CarFactory {
    private static GrandeurFactory factory;

    public GrandeurFactory(){

    }

    public static GrandeurFactory getInstance(){
        if(factory == null){
            factory = new GrandeurFactory();
        }

        return factory;
    }

    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = new Grandeur(MyLittleCar.GRANDEUR);

        return car;
    }

}
