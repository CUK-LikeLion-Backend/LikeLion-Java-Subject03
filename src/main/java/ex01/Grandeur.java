package ex01;

public class Grandeur implements MyLittleCar {
    private String name;

    public Grandeur(){}
    public Grandeur(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}
