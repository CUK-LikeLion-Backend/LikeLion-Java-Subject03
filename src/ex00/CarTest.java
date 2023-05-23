package ex00;

//Client
public class CarTest {

    public static void main(String[] args) {
//        CarFactory factory = new SonataFactory();

        MyLittleCar car1 = new SonataFactory().produceCar();
        MyLittleCar car2 = new GenesisFactory().produceCar();
        MyLittleCar car3 = new GrandeurFactory().produceCar();
        MyLittleCar car4 = new NonameFactory().produceCar();

        System.out.println("c1 is a "+car1);
        System.out.println("c2 is a "+car2);
        System.out.println("c3 is a "+car3);
        System.out.println("c4 is a "+car4);

    }
}
