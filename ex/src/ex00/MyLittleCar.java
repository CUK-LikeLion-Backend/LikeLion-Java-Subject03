package ex00;

public abstract class MyLittleCar {
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";
    String productName;

    public MyLittleCar(String productName) {
        this.productName = productName;
    }

    public String toString() {
        return productName;
    }

    public abstract void carType();
}