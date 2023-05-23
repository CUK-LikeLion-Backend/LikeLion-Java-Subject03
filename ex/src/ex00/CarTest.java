package ex00;

import ex00.CarFactory;
import ex00.MyLittleCar;

public class CarTest {
    public static void main(String[] args) {
        /**
         * 객체를 생성할 때 어떤 클래스의 인스턴스를 만들 지 서브 클래스에서 결정하게 함
         * 즉, 인스턴스 생성을 서브 클래스에게 위임
         * 부모 추상 클래스는 인터페이스에만 의존하고 실제로 어떤 구현 클래스를 호출할 지는 서브 클래스에서 구현.
         * 이렇게 하면 새로운 구현 클래스가 추가되어도 기존 Factory 코드의 수정 없이 새로운 Factory 를 추가하면 됨.
         */

        CarTest test = new CarTest();
        MyLittleCar car = CarFactory.produceCar("Sonata");
        System.out.println(car);
    }
}