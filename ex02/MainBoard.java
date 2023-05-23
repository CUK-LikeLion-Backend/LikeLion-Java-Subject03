package ex02;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();

        Beginner_Level beginnerLevel = new Beginner_Level();
        Advanced_Level advancedLevel = new Advanced_Level();
        Super_Level superLevel = new Super_Level();

        //초급
        player.setLevel(beginnerLevel);
        player.play(1);

        //중급
        player.setLevel(advancedLevel);
        player.play(2);

        //고급
        player.setLevel(superLevel);
        player.play(3);
    }
}
