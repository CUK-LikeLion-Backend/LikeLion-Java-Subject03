// 팩토리 메소드는 부모 클래스에서 객체들을 생성할 수 있는 인터페이스를 제공하지만,
// 자식 클래스들이 생성될 객체들의 유형을 변경할 수 있도록 하는 생성 패턴
package ex00;

public class CarTest {

    public MyLittleCar produceCar(String name) {

        CarFactory car = null;
        MyLittleCar myLittleCar = null;

        if( name.equalsIgnoreCase(MyLittleCar.SONATA)) {
            car = new SonataFactory();
            myLittleCar = car.newInstance();
        }
        else if( name.equalsIgnoreCase(MyLittleCar.GENESIS)) {
            car = new GenesisFactory();
            myLittleCar = car.newInstance();
        } else if( name.equalsIgnoreCase(MyLittleCar.GRANDEUR)) {
            car = new GrandeurFactory();
            myLittleCar = car.newInstance();
        }
        else {
            car = new NonameFactory();
            myLittleCar = car.newInstance();
        }
        return myLittleCar;
    }

    public static void main(String[] args) {
        CarTest test = new CarTest();
        MyLittleCar car1 = test.produceCar("Sonata");
        System.out.println(car1);
        MyLittleCar car2 = test.produceCar("Genesis");
        System.out.println(car2);
        MyLittleCar car3 = test.produceCar("Grandeur");
        System.out.println(car3);


    }
}