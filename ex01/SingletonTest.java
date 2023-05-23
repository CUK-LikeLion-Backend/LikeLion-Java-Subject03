package ex01;

public class SingletonTest {
    public static void main(String[] args) {
        MyLittleCar carA = MyLittleCar.getInstance();  // MyLittleCar 클래스의 인스턴스를 얻어옴
        MyLittleCar carB = MyLittleCar.getInstance();  // MyLittleCar 클래스의 인스턴스를 얻어옴
        System.out.println(carA == carB);  // carA와 carB의 참조값 비교하여 동일한 인스턴스인지 확인하여 출력
    }
}
