package ex00;

public class Genesis extends MyLittleCar {
    public Genesis() {
        super(MyLittleCar.GENESIS);
    }

    @Override
    public void carType() {
        System.out.println("sedan");
    }
}