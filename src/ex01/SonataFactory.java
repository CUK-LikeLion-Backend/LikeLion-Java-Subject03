package ex01;

import ex00.MyLittleCar;

class Sonata extends MyLittleCar {
     Sonata(String productName) {
        super(productName);
    }
}

/*
기본생성자를 private 를 사용하여 생성을 불가능하게 하고 getInstance를 통해서만 생성이 가능합니다.
getInstance는 내부적으로 생성되지 않았다면 생성하고, 기존에 생성된 값이 존재한다면 생성된 인스턴스를
리턴하는 형태로 프로그램 전반에 걸쳐 하나의 인스턴스를 유지합니다.
 */
public class SonataFactory {
    private static SonataFactory instance ;
    private SonataFactory(Sonata sonata){
        // prvate 생성자로 외부에서 인스턴스 생성 방지
    }
    // synchronized : 멀티스레드 환경에서 동기화 문제 해결 (싱글 스레드 환경에서는 필요 없음)
    public static synchronized SonataFactory getFactory(){
        if(instance == null) { // 1번 _ 쓰레드가 동시 접근시 문제
            instance = new SonataFactory(new Sonata("Sonata")); // 2번 _ 쓰레드가 동시 접근시 인스턴스 여러번 생성
        }
        return instance;
    }
}
