package ex00;

public class CarTest {

    public MyLittleCar produceCar(String name) {
        MyLittleCar car = null;
        if( name.equalsIgnoreCase(MyLittleCar.GENESIS)) {
            car = new MyLittleCar(MyLittleCar.GENESIS);
        }
        return car;
    }

    public static void main(String[] args) {
        CarTest test = new CarTest();
        MyLittleCar car = test.produceCar("Genesis");
        System.out.println(car);
    }
}