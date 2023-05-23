package ex04;

public abstract class Car {

    public final void run() {
        startCar();
        drive();
        turn();
        stop();
        turnOff();
    }

    public abstract void startCar();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnOff();
    public abstract void turn();
}

