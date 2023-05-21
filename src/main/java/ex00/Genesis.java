package ex00;

public class Genesis implements MyLittleCar{
    private String name;

    public Genesis(){}

    public Genesis(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}
