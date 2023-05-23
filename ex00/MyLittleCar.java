package ex00;

public class MyLittleCar {
    public static final String GENESIS = "Genesis";
    String productName;
    public MyLittleCar(String productName) {
        this.productName = productName;
    }
    public String toString() {
        return productName;
    }
}