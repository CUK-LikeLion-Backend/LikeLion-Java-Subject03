package ex00;

import java.util.ArrayList;

public class CarTest {

//    public MyLittleCar produceCar(String name) {
//        MyLittleCar car = null;
//        if( name.equalsIgnoreCase(MyLittleCar.SONATA)) {
//            car = new MyLittleCar(MyLittleCar.SONATA);
//        }
//        else if( name.equalsIgnoreCase(MyLittleCar.GRANDEUR)) {
//            car = new MyLittleCar(MyLittleCar.GRANDEUR);
//        }
//        else if( name.equalsIgnoreCase(MyLittleCar.GENESIS)) {
//            car = new MyLittleCar(MyLittleCar.GENESIS);
//        }
//        else {
//            car = new MyLittleCar("noname");
//        }
//        return car;
//    }

    public static void main(String[] args) {
        ArrayList<CarFactory> factories = new ArrayList<>();
//        CarTest test = new CarTest();
        factories.add(new GenesisFactory());
        factories.add(new GrandeurFactory());
        factories.add(new SonataFactory());
        factories.add(new NonameFactory());
        for (CarFactory factory : factories) {
            System.out.println(factory.produceCar());
        }
    }
}
