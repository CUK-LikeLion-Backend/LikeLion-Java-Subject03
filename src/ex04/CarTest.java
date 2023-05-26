package ex04;

/**
 * 템플릿 메소드 패턴으로 운전하기
 *
 * 템플릿 메소드
 * 알고리즘의 골격을 정의합니다. 템플릿 메소드를 사용하면
 * 알고리즘 일부 단계를 서브클래스에서 구현할 수 있으며, 알고리즘의 구조는 그대로 유지하면서 알고리즘의 특정 단계를 서브클래스에서 재정의할 수도 있습니다.
 */
public class CarTest {
    public static void main(String[] args) throws Exception {
        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("===============");
        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
