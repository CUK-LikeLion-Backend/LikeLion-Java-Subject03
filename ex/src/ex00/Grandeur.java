package ex00;

public class Grandeur extends MyLittleCar {
    public Grandeur() {
        super(MyLittleCar.GRANDEUR);
    }

    @Override
    public void carType() {
        System.out.println("premium");
    }
}