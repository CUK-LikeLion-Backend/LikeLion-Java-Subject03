package ex01;

public class MyLittleCar {
    private static MyLittleCar instance;  // 인스턴스를 저장할 정적 변수 선언
    public static final String SONATA = "Sonata";  // 상수 정의
    public static final String GRANDEUR = "Grandeur";  // 상수 정의
    public static final String GENESIS = "Genesis";  // 상수 정의
    private String productName;  // 제품명 저장을 위한 인스턴스 변수

    private MyLittleCar(String productName) {
        this.productName = productName;  // 제품명 초기화
    }

    public static MyLittleCar getInstance() {
        if (instance == null) {  // 인스턴스가 아직 생성되지 않았을 경우
            instance = new MyLittleCar("noname");  // 인스턴스 생성
        }
        return instance;  // 인스턴스 반환
    }

    public String getProductName() {
        return productName;  // 제품명 반환
    }

    public void setProductName(String productName) {
        this.productName = productName;  // 제품명 설정
    }

    public String toString() {
        return productName;  // 제품명 반환
    }
}
