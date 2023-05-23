package ex02;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.setLevel(new Beginner());
        player.play(1);
        player.setLevel(new Advanced());
        player.play(2);
        player.setLevel(new Super());
        player.play(3);
        }

}
