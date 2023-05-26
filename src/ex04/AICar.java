package ex04;

public class AICar extends Car {

    @Override
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    @Override
    public void turn() {
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }
}