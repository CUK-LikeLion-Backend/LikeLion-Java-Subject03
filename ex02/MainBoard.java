package main.java.ex02;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        player.slide();

        player.setLevel(Player.ADVANCED_LEVEL);
        player.play(2);
        player.slide();

        player.setLevel(Player.SUPER_LEVEL);
        player.play(3);
        player.slide();
    }
}