package ex00;

public class Noname implements MyLittleCar{
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
