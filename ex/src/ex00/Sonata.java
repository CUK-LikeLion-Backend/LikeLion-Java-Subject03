package ex00;

public class Sonata extends MyLittleCar {
    public Sonata() {
        super(MyLittleCar.SONATA);
    }

    @Override
    public void carType() {
        System.out.println("Sedan");
    }
}