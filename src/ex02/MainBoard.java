package ex02;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        player.setLevel(new Advanced());    //상태 클래스를 매개변수로 전달, 상태 설정
        player.play(2);     //설정된 상태에 맞게 실행
        player.setLevel(new Super());
        player.play(3);
    }
}
