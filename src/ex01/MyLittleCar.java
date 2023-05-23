package ex01;

public abstract class MyLittleCar {
    private static MyLittleCar instance;
    private String productName;

    private MyLittleCar(String productName) {
        this.productName = productName;
    }


    @Override
    public String toString() {
        return "MyLittleCar{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
