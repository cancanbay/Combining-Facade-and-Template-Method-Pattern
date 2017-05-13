import Facade.Convoys;

public class Test {

    public static void main(String[] args) {
        // creating facade object and adding new trips.
        Convoys convoys = new Convoys();
        
        convoys.tripConvoyA();
        System.out.println("----------------------------------------------------------------------");
        convoys.tripConvoyB();
        System.out.println("----------------------------------------------------------------------");
        convoys.tripConvoyC();
        System.out.println("----------------------------------------------------------------------");
        convoys.tripConvoyD();

    }
}
