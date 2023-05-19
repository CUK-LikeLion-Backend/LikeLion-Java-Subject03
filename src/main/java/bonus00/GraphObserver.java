package bonus00;

public class GraphObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver: ");
        for (int i=0; i<generator.getNumber(); ++i)
            System.out.print("=");
        System.out.println();
    }
}
