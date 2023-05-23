package ex00;

public abstract class CarFactory {

    public MyLittleCar newInstance() {
        MyLittleCar car = createCar();
        car.doIt();
        return car;
    }

    public abstract MyLittleCar createCar();
}