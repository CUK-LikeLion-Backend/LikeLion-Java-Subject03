package ex01;

public class SingletonTest {
    public static void main(String[] args) {
        SonataFactory sonataFactoryA = SonataFactory.getFactory();
        SonataFactory sonataFactoryB = SonataFactory.getFactory();
        GrandeurFactory grandeurFactoryA = GrandeurFactory.getFactory();
        GrandeurFactory grandeurFactoryB = GrandeurFactory.getFactory();
        GenesisFactory genesisFactoryA = GenesisFactory.getFactory();
        GenesisFactory genesisFactoryB = GenesisFactory.getFactory();
        NonameFactory nonameFactoryA = NonameFactory.getFactory();
        NonameFactory nonameFactoryB = NonameFactory.getFactory();

        System.out.println(sonataFactoryA == sonataFactoryB);
        System.out.println(grandeurFactoryA == grandeurFactoryB);
        System.out.println(genesisFactoryA == genesisFactoryB);
        System.out.println(nonameFactoryA == nonameFactoryB);

        System.out.println(sonataFactoryA.produceCar());
    }
}