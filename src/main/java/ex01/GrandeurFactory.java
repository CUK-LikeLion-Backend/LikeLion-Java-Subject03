package ex01;

public class GrandeurFactory implements CarFactory {
    private static GrandeurFactory instance;
    private GrandeurFactory(){}

    public static GrandeurFactory getInstance(){
        if(instance==null){
            instance = new GrandeurFactory();
            return instance;
        }
        else{
            return instance;
        }
    }


    @Override
    public MyLittleCar makeCar() {
        MyLittleCar car = new Grandeur(MyLittleCar.GRANDEUR);
        return car;
    }
}
