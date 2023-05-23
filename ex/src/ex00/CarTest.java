package ex00;

public class CarTest {

    public MyLittleCar produceCar(String name) {
        MyLittleCar car = null;
        if( name.equalsIgnoreCase(MyLittleCar.SONATA)) {
            car = new Sonata();
        }
        else if( name.equalsIgnoreCase(MyLittleCar.GRANDEUR)) {
            car = new Grandeur();
        }
        else if( name.equalsIgnoreCase(MyLittleCar.GENESIS)) {
            car = new Genesis();
        }
        else {
            car = new Noname();
        }
        return car;
    }

    public static void main(String[] args) {
        CarTest test = new CarTest();
        MyLittleCar car = test.produceCar("Sonata");
        System.out.println(car);
        car.carType();
    }
}