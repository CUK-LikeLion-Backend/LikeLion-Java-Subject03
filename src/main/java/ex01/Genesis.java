package ex01;

public class Genesis implements MyLittleCar {
    String productName;

    private Genesis() {}

    public Genesis(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
