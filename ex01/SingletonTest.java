package main.java.ex01;

public class SingletonTest {
    public static void main(String[] args) {

        SonataFactory sonataFactoryA = SonataFactory.getFactory();
        SonataFactory sonataFactoryB = SonataFactory.getFactory();

        System.out.println(sonataFactoryA == sonataFactoryB);
    }
}
