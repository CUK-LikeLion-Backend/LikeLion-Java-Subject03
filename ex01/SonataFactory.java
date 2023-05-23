package main.java.ex01;

public class SonataFactory {
    private static SonataFactory instance;

    private SonataFactory() {
        // private 생성자
    }

    public static SonataFactory getFactory() {
        if (instance == null) {
            synchronized (SonataFactory.class) {
                if (instance == null) {
                    instance = new SonataFactory();
                }
            }
        }
        return instance;
    }
}
