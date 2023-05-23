package ex00;

/**
 * 팩토리 메소드 패턴으로 자동차 만들기
 *
 * 팩토리 메소드
 * 객체를 생성할 때 필요한 인터페이스를 만듭니다.
 * 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정합니다. 팩토리 메소드 패턴을 사용하면 클래스 인스턴스 만드는 일을 서브클래스에게 맡기게 됩니다.
 */
public class CarTest {
    public MyLittleCar produceCar(String name) {
        MyLittleCar car=null;
        if( name.equalsIgnoreCase("sonata")) {
            car=new Sonata();
        }
        else if( name.equalsIgnoreCase("Genesis")) {
            car=new Genesis();
        }
        else if( name.equalsIgnoreCase("Granduer")) {
            car=new Grandeur();
        }
        return car;
    }

    public static void main(String[] args) {
        CarTest test = new CarTest();
        MyLittleCar car = test.produceCar("Sonata");
        System.out.println(car);
    }
}
