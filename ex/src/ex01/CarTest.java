package ex01;

public class CarTest {
    public MyLittleCar produceCar(String name) {
        CarFactory factory = CarFactory.getInstance();
        return factory.produceCar(name);
    }

    public static void main(String[] args) {
        CarTest test = new CarTest();
        MyLittleCar car = test.produceCar("Sonata");
        System.out.println(car);
        car.carType();
    }
}