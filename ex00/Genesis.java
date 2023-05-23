package ex00;

public class Genesis extends MyLittleCar {
    public Genesis(String productName) {
        super(productName); // MyLittleCar의 생성자 호출하여 productName 초기화
    }

    @Override
    public String toString() {
        return getProductName(); // Genesis 출력시, 객체 자신의 제품명 (Genesis) 반환
    }
}
