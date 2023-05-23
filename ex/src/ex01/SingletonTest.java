package ex01;

public class SingletonTest {
    public static void main(String[] args) {

        /**
         * 객체의 인스턴스가 오직 1개만 생성되는 패턴
         */
        SonataFactory sonataFactoryA = SonataFactory.getFactory();
        SonataFactory sonataFactoryB = SonataFactory.getFactory();

        System.out.println(sonataFactoryA == sonataFactoryB);
    }
}