package ex01;

public class SingletonTest {
    public static void main(String[] args) {
        //처음 인스턴스 생성하고 그 뒤에는 생성된 인스턴스를 반환하므로 동일한 인스턴스 참조!!
        MyLittleCar myLittleCarA = MyLittleCar.getInstance("Sonata");
        MyLittleCar myLittleCarB = MyLittleCar.getInstance("Genesis");


        System.out.println(myLittleCarA == myLittleCarB);
    }
}
