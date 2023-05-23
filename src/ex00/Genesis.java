package ex00;

public class Genesis implements MyLittleCar{
    private String productName;

    public Genesis(){

    }
    public Genesis(String productName){
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
