package ex00;

public class MyLittleCar {
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";
    private String productName; // 제품명 변수 선언

    // MyLittleCar 생성자
    public MyLittleCar(String productName) {
        this.productName = productName;
    }
    public String toString() {
        return productName;
    }

    ////
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    ////
}
