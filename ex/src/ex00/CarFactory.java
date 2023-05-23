package ex00;

public class CarFactory {
    public static MyLittleCar produceCar(String name) {
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