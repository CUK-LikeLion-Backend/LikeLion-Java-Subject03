package ex01;

public class CarTest {

    public static void main(String[] args) {
        CarTest test = new CarTest();
        MyLittleCar car1 = SonataFactory.getInstance().makeCar();
        MyLittleCar car2 = GrandeurFactory.getInstance().makeCar();
        MyLittleCar car3 = GenesisFactory.getInstance().makeCar();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}