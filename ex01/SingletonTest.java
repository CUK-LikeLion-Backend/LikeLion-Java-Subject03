package ex01;

public class SingletonTest {
    public static void main(String[] args) {
        MyLittleCar myLittleCar1 = MyLittleCar.getInstance("Sonata");
        MyLittleCar myLittleCar2 = MyLittleCar.getInstance("Sonata");
        MyLittleCar myLittleCar3 = MyLittleCar.getInstance("Genesis");

        System.out.println(myLittleCar1 == myLittleCar2);
        System.out.println(myLittleCar1 == myLittleCar3);
    }
}
