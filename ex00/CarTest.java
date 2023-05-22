package ex00;

public class CarTest {
    public MyLittleCar produceCar(String name) {
        MyLittleCar car = null;
        if( name.equalsIgnoreCase(MyLittleCar.SONATA)) {
            car = new MyLittleCar(MyLittleCar.SONATA);
        }
        else if( name.equalsIgnoreCase(MyLittleCar.GRANDEUR)) {
            car = new MyLittleCar(MyLittleCar.GRANDEUR);
        }
        else if( name.equalsIgnoreCase(MyLittleCar.GENESIS)) {
            car = new MyLittleCar(MyLittleCar.GENESIS);
        }
        else {
            car = new MyLittleCar("noname");
        }
        return car;
    }

    public static void main(String[] args) {
        CarTest test = new CarTest();
        MyLittleCar carGenesis = test.produceCar("Genesis");
        System.out.print("<  ");
        System.out.print(carGenesis);
        System.out.print("  >\n");
        carGenesis.run();
        System.out.println("\n==============================\n");
        MyLittleCar carSonata = test.produceCar("Sonata");
        System.out.print("<  ");
        System.out.print(carSonata);
        System.out.print("  >\n");
        carSonata.run();
        System.out.println("\n==============================\n");
        MyLittleCar carGrandeur = test.produceCar("Grandeur");
        System.out.print("<  ");
        System.out.print(carGrandeur);
        System.out.print("  >\n");
        carGrandeur.run();
        System.out.println("\n==============================\n");
        MyLittleCar carNoname = test.produceCar("Noname");
        System.out.print("<  ");
        System.out.print(carNoname);
        System.out.print("  >\n");
        carNoname.run();
    }
}
