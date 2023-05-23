package ex00;

public class NonameFactory implements CarFactory{
    @Override
    public MyLittleCar produceCar() {
        return new MyLittleCar("noname");
    }
}
