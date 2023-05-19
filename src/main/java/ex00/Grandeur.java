package ex00;

public class Grandeur implements MyLittleCar {
    String productName;

    private Grandeur() {}

    public Grandeur(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
