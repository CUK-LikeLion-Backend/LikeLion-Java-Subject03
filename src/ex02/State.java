package ex02;

public interface State {
    State jump();
    State run();
    State turn();
}

class Beginner implements State {
    @Override
    public State jump() {
        System.out.println("Jump 할 줄 모르지롱.");
        return null;
    }

    @Override
    public State run() {
        System.out.println("천천히 달립니다.");
        return null;
    }

    @Override
    public State turn() {
        System.out.println("Turn 할 줄 모르지롱.");
        return null;
    }
}

class Advanced implements State{
    @Override
    public State jump() {
        System.out.println("높이 jump합니다.");
        return null;
    }

    @Override
    public State run() {
        System.out.println("빨리 달립니다.");
        return null;
    }

    @Override
    public State turn() {
        System.out.println("Turn 할 줄 모르지롱.");
        return null;
    }
}

class Super implements State{
    @Override
    public State jump() {
        System.out.println("아주 높이 뛴다.");
        return null;
    }

    @Override
    public State run() {
        System.out.println("아주 빨리 뛴다.");
        return null;
    }

    @Override
    public State turn() {
        System.out.println("한 바퀴 돈다.");
        return null;
    }
}