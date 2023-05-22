package ex04;

public abstract class Car {
    public final void run() {
        startCar();
        drive();
        turn();
        stop();
        turnOff();
    }

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public abstract void drive();

    public void turn() {
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    public void stop() {
        System.out.println("스스로 멈춥니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
}
