package ex02;

/**
 * 상태 패턴으로 플레이어 만들기
 *
 * 싱글패턴
 *
 * 상태 패턴을 사용하면 객체의 내부 상태가 바뀜에 따라서 객체의 행동을 바꿀 수 있습니다. 마치 객체의 클래스가 바뀌는 것과 같은 결과를 얻을 수 있습니다.
 */
public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        player.setLevel(Player.ADVANCED_LEVEL);
        player.play(2);
        player.setLevel(Player.SUPER_LEVEL);
        player.play(3);
    }
}