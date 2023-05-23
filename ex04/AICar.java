package ex04;
public class AICar extends Car {
    @Override
    void drive() {
        System.out.println("자율주행합니다");
    }

    @Override
    void stop() {
        System.out.println("스스로 멈춥니다");
    }
}
