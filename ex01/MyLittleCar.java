package ex01;

public class MyLittleCar {
    private static MyLittleCar Instance;
    private String name;

    public MyLittleCar(String name){
        this.name = name;
    }

    public static MyLittleCar getInstance(String name) {
        if (Instance == null) //Instance 변수가 null인 경우!! 즉 처음 호출될 때만 인스턴스를 생성
            Instance = new MyLittleCar(name);
        return Instance; //싱글톤 인스턴스에 접근할 수 있도록 함
    }
}
