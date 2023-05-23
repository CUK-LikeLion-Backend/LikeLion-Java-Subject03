package ex01;

import ex00.CarFactory;
import ex00.MyLittleCar;
import ex00.Sonata;

public class SonataFactory implements CarFactory {
    private static SonataFactory factory;

    private SonataFactory(){
        //생성자를 private으로 선언하여 외부에서 인스턴스를 직접 생성하는 것을 막음
    }

    public static SonataFactory getInstance(){
        //객체의 인스턴스가 오직 1개만 생성되도록(싱글톤 패턴)
        // 인스턴스가 없을 경우에는 인스턴스를 생성,
        // 이미 인스턴스가 존재하는 경우에는 기존에 이미 생성된 인스턴스를 반환
        if(factory == null){
            factory = new SonataFactory();
        }
        return factory;
    }

    @Override
    public MyLittleCar produceCar() {
        MyLittleCar car = new Sonata(MyLittleCar.SONATA);

        return car;
    }

}
