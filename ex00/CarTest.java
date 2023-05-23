package main.java.ex00;

public class CarTest {
    public MyLittleCar produceCar(String name) {
        MyLittleCar car = null;

        if( name.equalsIgnoreCase(MyLittleCar.SONATA)) {
            car = new MyLittleCar(MyLittleCar.SONATA);
        }
        else if( name.equalsIgnoreCase(MyLittleCar.GRANDEUR)) {
            car = new MyLittleCar(MyLittleCar.GRANDEUR);
        }
        else if( name.equalsIgnoreCase(MyLittleCar.GENESIS)) {
            car = new MyLittleCar(MyLittleCar.GENESIS);
        }
        else {
            car = new MyLittleCar("noname");
        }

        return car;
    }

    public static void main(String[] args) {
        CarTest test = new CarTest();
        MyLittleCar car = test.produceCar("Grandeur");
        System.out.println(car);
        car.drive();
    }
}