package ex00;

public class Grandeur implements MyLittleCar{
    private String productName;

    public Grandeur(){

    }
    public Grandeur(String productName){
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
