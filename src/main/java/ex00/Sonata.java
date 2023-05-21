package ex00;

public class Sonata implements MyLittleCar{
    private String name;

    public Sonata(){}
    public Sonata(String name){
        this.name = name;
    }

    @Override
    public String toString(){

        return name;
    }
}
