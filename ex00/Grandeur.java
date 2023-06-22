package ex00;

public class Grandeur extends MyLittleCar {
    public Grandeur(String productName) {
        super(productName);
    }

    @Override
    public String toString() {
        return getProductName();
    }
}
