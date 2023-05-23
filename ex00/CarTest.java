package ex00;

public class CarTest {

    public MyLittleCar produceCar(String name) { // 자동차 객체를 생성하는 팩토리 메서드 패턴
        MyLittleCar car = null;

        // name 값에 따라 MyLittleCar 객체 생성
        if( name.equalsIgnoreCase(MyLittleCar.SONATA)) {
            car = new MyLittleCar(MyLittleCar.SONATA);
        }
        else if( name.equalsIgnoreCase(MyLittleCar.GRANDEUR)) {
            car = new MyLittleCar(MyLittleCar.GRANDEUR);
        }
        else if( name.equalsIgnoreCase(MyLittleCar.GENESIS)) {
            car = new MyLittleCar(MyLittleCar.GENESIS);
        }
        else {
            // name 값이 지정된 상수와 일치하지 않을 경우 "noname"을 가진 익명 클래스로 MyLittleCar 객체 생성
            car = new MyLittleCar("noname"){
                // toString() 메서드 재정의
                @Override
                public String toString() {
                    return getProductName();
                }
            };
        }
        return car; // 생성된 MyLittleCar 객체 반환
    }

    public static void main(String[] args) {
        CarTest test = new CarTest();
        MyLittleCar car = test.produceCar("Sonata");
        MyLittleCar car2 = test.produceCar("Grandeur");
        MyLittleCar car3 = test.produceCar("Genesis");

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);

    }
}