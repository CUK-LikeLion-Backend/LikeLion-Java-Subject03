package ex04;

public abstract class Car {
    // 템플릿 메소드
    public final void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
    // hook 메소드
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
    // 추상 메소드
    public abstract void drive();
    public abstract void stop();
}
