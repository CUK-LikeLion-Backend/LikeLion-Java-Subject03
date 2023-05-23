package ex01;

import ex00.CarFactory;
import ex00.MyLittleCar;
import ex00.Noname;
import ex00.Sonata;

public class NonameFactory implements CarFactory {
    private static NonameFactory factory;

    public NonameFactory(){

    }

    public static NonameFactory getInstance(){
        if(factory == null){
            factory = new NonameFactory();
        }

        return factory;
    }

    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = new Noname("noname");

        return car;
    }

}
