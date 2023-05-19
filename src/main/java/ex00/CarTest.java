package ex00;


import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        CarTest test = new CarTest();
        ArrayList<CarFactory> factories = new ArrayList<>();

        factories.add(new SonataFactory());
        factories.add(new GrandeurFactory());
        factories.add(new GenesisFactory());
        factories.add(new NonameFactory());

        for(CarFactory factory : factories) {
            MyLittleCar car = factory.produceCar();
            System.out.println("This is a " + car);
        }
    }
}