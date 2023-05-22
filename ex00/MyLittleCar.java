package ex00;

public class MyLittleCar extends CarFactory {
    private String name;
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";

    public MyLittleCar(String name) {
        super(name);
        this.name = name;
    }

    public String toString() {
        return name;
    }
    @Override
    public void run() {
        if (getName().equalsIgnoreCase(SONATA)) {
            Sonata sonata = new Sonata();
            sonata.run();
        } else if (getName().equalsIgnoreCase(GRANDEUR)) {
            Grandeur grandeur = new Grandeur();
            grandeur.run();
        } else if (getName().equalsIgnoreCase(GENESIS)) {
            Genesis genesis = new Genesis();
            genesis.run();
        } else {
            System.out.println("알 수 없는 자동차입니다.");
        }
    }
}
