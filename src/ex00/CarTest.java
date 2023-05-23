package ex00;


public class CarTest { // 클라이언트 구현체 인터페이스에만 의존
    public static void main(String[] args) {
        CarConfig carconfig = new CarConfig() ;
        MyLittleCar car1 = carconfig.produceCar("Sonata");
        System.out.println(car1);
        MyLittleCar car2 = carconfig.produceCar("Grandeur");
        System.out.println(car2);
        MyLittleCar car3 = carconfig.produceCar("");
        System.out.println(car3);

    }
}
