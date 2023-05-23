package ex00;

//ConcreteProduct
public class Sonata implements MyLittleCar{
    private String productName;

    public Sonata(){

    }
    public Sonata(String productName){
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }

}
