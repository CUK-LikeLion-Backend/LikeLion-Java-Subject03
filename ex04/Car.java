package ex04;

public abstract class Car {
    public final void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }

    void startCar(){
        System.out.println("시동을 켭니다");
    }

    void turnOff(){
        System.out.println("시동을 끕니다");
    }

    //AI차는 자율주행 + 자동멈추기 AICar에 써주기
    abstract void drive();
    abstract void stop();
}
