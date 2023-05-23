package ex01;

import ex00.MyLittleCar;


public class SingletonTest {
    public static void main(String[] args) {

        SonataFactory sonataFactoryA = SonataFactory.getFactory();
        SonataFactory sonataFactoryB = SonataFactory.getFactory();

        System.out.println(sonataFactoryA == sonataFactoryB);
    }
}