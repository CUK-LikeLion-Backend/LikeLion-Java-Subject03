package ex02;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        player.setLevel(player.getAdvancedLevel());
        player.play(2);
        player.setLevel(player.getSuperLevel());
        player.play(3);
    }
}