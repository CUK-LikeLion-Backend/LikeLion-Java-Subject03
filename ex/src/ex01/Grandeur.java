package ex01;
public class Grandeur extends MyLittleCar {
    public Grandeur() {
        super(MyLittleCar.GRANDEUR);
    }

    @Override
    public void carType() {
        System.out.println("premium");
    }
}
