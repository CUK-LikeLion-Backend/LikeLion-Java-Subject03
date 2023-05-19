package ex00;

public class Noname implements MyLittleCar {
    String productName;

    private Noname() {}

    public Noname(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
