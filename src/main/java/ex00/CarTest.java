package ex00;

public class CarTest {

    public static void main(String[] args) {
        CarTest test = new CarTest();
        MyLittleCar car1 = new SonataFactory().makeCar();
        MyLittleCar car2 = new GrandeurFactory().makeCar();
        MyLittleCar car3 = new GenesisFactory().makeCar();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}