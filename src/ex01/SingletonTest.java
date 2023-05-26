package ex01;

/**
 * 싱글톤 패턴으로 자동차 공장 만들기
 *
 * 싱글톤
 * 특정 클래스에 객체 인스턴스가 하나만 만들어지도록 해주는 패턴입니다. 싱글턴 패턴을 사용하면 전역 변수를 사용할 때와
 * 마찬가지로 객체 인스턴스를 어디서든지 액세스 할 수 있게 만들 수 있습니다. 클래스 인스턴스를 하나만 만들고 그 인스턴스로의 전역 접근을 제공합니다.
 */
public class SingletonTest {
    public static void main(String[] args) {
        Sonata sonataFactoryA = Sonata.getFactory();
        Sonata sonataFactoryB = Sonata.getFactory();

        System.out.println(sonataFactoryA == sonataFactoryB);
    }
}
