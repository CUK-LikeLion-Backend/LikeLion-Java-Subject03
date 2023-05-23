package ex02;

public class Player {
        private LevelState level;
        public Player(){
                level = new Beginner_Level();
        }

        public LevelState getLevel(){
                return level;
        }
        public void setLevel(LevelState level) {
                this.level = level;
        }

        public void play(int time) {
                level.run();
                for(int i =0; i<time; i++) {
                        level.jump();
                }
                level.turn();
        }
}
