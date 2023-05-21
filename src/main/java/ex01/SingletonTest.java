package ex01;

public class SingletonTest {
    public static void main(String[] args) {

        SonataFactory sonataFactoryA = SonataFactory.getInstance();
        SonataFactory sonataFactoryB = SonataFactory.getInstance();

        System.out.println(sonataFactoryA == sonataFactoryB);
    }
}