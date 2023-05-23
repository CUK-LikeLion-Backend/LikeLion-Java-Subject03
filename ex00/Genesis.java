package ex00;

public class Genesis extends MyLittleCar {

    public String toString() {
        return "Genesis";
    }

    @Override
    public void doIt() {
        System.out.println("MyLittleCar is " + toString());
    }
}
