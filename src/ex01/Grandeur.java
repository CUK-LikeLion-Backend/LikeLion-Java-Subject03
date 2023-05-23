package ex01;

import ex00.MyLittleCar;

public class Grandeur implements MyLittleCar {
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
