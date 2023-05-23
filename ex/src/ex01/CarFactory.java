package ex01;

public class CarFactory {
    private static CarFactory instance;

    private CarFactory() { //외부생성 막음

    }

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance; //
    }

    public MyLittleCar produceCar(String name) {
        MyLittleCar car = null;

        if (name.equalsIgnoreCase(MyLittleCar.SONATA)) {
            car = new Sonata();
        } else if (name.equalsIgnoreCase(MyLittleCar.GRANDEUR)) {
            car = new Grandeur();
        } else if (name.equalsIgnoreCase(MyLittleCar.GENESIS)) {
            car = new Genesis();
        } else {
            car = new Noname() {
                public String CarType() {
                    return "Unknown";
                }
            };
        }

        return car;
    }
}
