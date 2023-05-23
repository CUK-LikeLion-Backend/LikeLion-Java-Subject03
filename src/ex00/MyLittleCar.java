package ex00;

public abstract class MyLittleCar {
    String productName;

    public MyLittleCar(String productName){
        this.productName=productName;
    }

    @Override
    public String toString() {
        return "MyLittleCar{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
