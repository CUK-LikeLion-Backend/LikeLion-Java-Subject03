package ex00;

public class Sonata implements MyLittleCar {
    String productName;

    private Sonata() {}

    public Sonata(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
