package ex01;

public class SonataFactory implements CarFactory {
    private static SonataFactory instance;
    private SonataFactory(){}

    public static SonataFactory getInstance(){
        if(instance==null){
            instance = new SonataFactory();
            return instance;
        }
        else{
            return instance;
        }
    }


    @Override
    public MyLittleCar makeCar() {
        MyLittleCar car = new Sonata(MyLittleCar.SONATA);
        return car;
    }
}
