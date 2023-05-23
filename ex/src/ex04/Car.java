package ex04;

public class Car {

    public final void run(){
        System.out.println("시동을 켭니다.");
        hook();
        System.out.println("시동을 끕니다.");
    }

    public void hook(){};
}
