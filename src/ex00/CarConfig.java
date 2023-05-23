package ex00;

class Sonata extends MyLittleCar {
    public Sonata(String productName) {
        super(productName);
    }
}

class Grandeur extends MyLittleCar {
    public Grandeur(String productName) {
        super(productName);
    }
}

class Genesis extends MyLittleCar {
    public Genesis(String productName) {
        super(productName);
    }
}

public class CarConfig {
    public static final String SONATA = "sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";

    public MyLittleCar produceCar(String name) {
        MyLittleCar car = null;
        if( name.equalsIgnoreCase(SONATA)) {
            car = new Sonata(SONATA);
        }
        else if( name.equalsIgnoreCase(GRANDEUR)) {
            car = new Grandeur(GRANDEUR);
        }
        else if( name.equalsIgnoreCase(GENESIS)) {
            car = new Genesis(GENESIS);
        }
        else {
            car = new MyLittleCar("noname") {
                @Override
                public String toString() {
                    return super.toString();
                }
            };
        }
        return car;
    }

}
