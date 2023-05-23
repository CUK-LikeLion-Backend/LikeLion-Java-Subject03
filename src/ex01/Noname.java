package ex01;

import ex00.MyLittleCar;

public class Noname implements MyLittleCar {
    private String productName;

    public Noname(){

    }
    public Noname(String productName){
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
