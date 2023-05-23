package ex01;



public class SonataFactory {
    private SonataFactory(){}
    private static SonataFactory Instance = new SonataFactory();

    public static SonataFactory getInstance() {
        return Instance;
    }

    public static SonataFactory getFactory() {
        return Instance;
    }
}
