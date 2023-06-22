package ex00;

public class Sonata extends MyLittleCar {
    public Sonata(String productName) {
        super(productName);
    }

    @Override
    public String toString() {
        return getProductName();
    }
}