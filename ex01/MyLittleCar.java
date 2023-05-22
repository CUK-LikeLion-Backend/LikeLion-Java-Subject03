package ex01;

import ex00.CarFactory;

public class MyLittleCar {
    private static MyLittleCar instance;
    private String name;
    private boolean engine;
    private int speed;
    private int fuel;

    public MyLittleCar(String name) {
        this.name = name;
        this.engine = false;
        this.speed = 0;
        this.fuel = 50;   // 최대가 100이라고 가정
    }

    public static MyLittleCar getInstance(String name) {
        if(instance == null) {
            instance = new MyLittleCar(name);
        }
        return instance;
    }

    public void turnOnEngine() {
        if (!engine) {
            engine = true;
            System.out.println("자동차의 시동이 켜졌습니다.");
        } else {
            System.out.println("자동차의 시동이 이미 켜져있습니다.");
        }
    }

    public void turnOffEngine() {
        while (speed > 0) { speedDown(); }

        if(engine) {
            engine = false;
            System.out.println("자동차의 시동이 꺼졌습니다.");
        }
        else {
            System.out.println("자동차의 시동이 이미 꺼져있습니다.");
        }
    }

    public void speedUp() {
        if(speed > 260) {
            System.out.println("속도가 너무 빠릅니다! 즉시 감속하세요!");
        }
        else {
            speed += 10;
            System.out.println("속도가 10 증가했습니다. 현재 속도는 " + speed + "입니다.");
        }
    }

    public void speedDown() {
        if(speed <= 0) {
            speed = 0;
            System.out.println("더이상 감속할 수 없습니다.");
        }
        else {
            if(speed <= 10) {
                speed--;
                System.out.println("속도가 1 감소했습니다. 현재 속도는 " + speed + "입니다.");
            }
            else {
                speed -= 10;
                System.out.println("속도가 10 감소했습니다. 현재 속도는 " + speed + "입니다.");
            }
        }
    }

    public void refuel(int amountFuel) {
        System.out.println("연료 충전을 시작합니다.");
        if(fuel + amountFuel > 100) {
            fuel = 100;
            System.out.println("연료가 가득차 더이상 충전할 수 없습니다. 현재 연료의 양은 " + fuel + "입니다.");
        }
        else {
            fuel += amountFuel;
            System.out.println("연료가 충전되었습니다. 현재 " + fuel + "만큼의 연료가 남아 있습니다.");
        }
    }

    public void stop() {
        while(speed > 0) { speedDown(); }
        System.out.println("자동차가 멈췄습니다.");
    }

    public void drive() {
        if(fuel == 0) {
            System.out.println("남은 연료가 없습니다. 운행이 중지됩니다.");
            turnOffEngine();
        }
        else if(fuel < 10) {
            System.out.println("남은 연료의 양이 10 미만입니다. 연료를 충전해야 합니다.");
        }

        if(engine) {
            System.out.println("현재 속도 " + speed + "km로 주행 중입니다.");
            fuel -= 10;
        }
        else {
            System.out.println("시동이 꺼져있습니다. 시동을 먼저 켜주세요.");
        }
    }
}
