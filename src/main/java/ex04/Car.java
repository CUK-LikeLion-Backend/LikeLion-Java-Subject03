package ex04;

public abstract class Car {
    
    //템플릿 메서드
    public final void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }

    //훅 메서드
    void startCar(){
        System.out.println("시동을 켭니다.");
    }

    void turnOff(){
        System.out.println("시동을 켭니다.");
    }
    
    //추상 메서드
    abstract void drive();
    abstract void stop();
}