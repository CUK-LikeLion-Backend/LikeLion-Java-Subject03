package ex01;

//Client
public class SingletonTest {

    public static void main(String[] args) {

        SonataFactory sonataFactoryA = SonataFactory.getInstance();
        SonataFactory sonataFactoryB = SonataFactory.getInstance();
        GenesisFactory genesisFactoryA = GenesisFactory.getInstance();
        GenesisFactory genesisFactoryB = GenesisFactory.getInstance();
        GrandeurFactory grandeurFactoryA = GrandeurFactory.getInstance();
        GrandeurFactory grandeurFactoryB = GrandeurFactory.getInstance();
        NonameFactory nonameFactoryA = NonameFactory.getInstance();
        NonameFactory nonameFactoryB = NonameFactory.getInstance();

        System.out.println(sonataFactoryA == sonataFactoryB);
        System.out.println(genesisFactoryA == genesisFactoryB);
        System.out.println(grandeurFactoryA == grandeurFactoryB);
        System.out.println(nonameFactoryA == nonameFactoryB);


    }
}
