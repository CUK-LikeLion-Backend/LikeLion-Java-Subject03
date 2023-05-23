package ex00;

public class Sonata extends MyLittleCar {

    public String toString() {
        return "Sonata";
    }

    @Override
    public void doIt() {
        System.out.println("MyLittleCar is " + toString());
    }
}
