package main.java.ex01;

public class MyLittleCar2 {
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";

    String productName;
    public MyLittleCar2(String productName) {

        this.productName = productName;
    }

    public String toString() {
        return productName;
    }

    public void drive() {
        System.out.println("Driving " + productName + "...");
    }
}
