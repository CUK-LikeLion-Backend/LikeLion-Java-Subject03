package main.java.ex04;

public abstract class Car {
    public final void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }

    public void startCar(){
        System.out.println("시동을 켭니다.");
    };
    public abstract void drive();
    public abstract void stop();
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    };
}
