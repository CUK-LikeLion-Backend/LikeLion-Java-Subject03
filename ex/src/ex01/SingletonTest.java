package ex01;

public class SingletonTest {
    public static void main(String[] args) {
        CarFactory factoryA = CarFactory.getInstance();
        CarFactory factoryB = CarFactory.getInstance();

        System.out.println(factoryA == factoryB);
    }
}