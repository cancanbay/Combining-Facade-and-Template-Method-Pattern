package Facade;

import Convoy.ConvoyA;
import Convoy.ConvoyB;
import Convoy.ConvoyC;
import Convoy.ConvoyD;
import Trip.RoadTrip;

/**
 * Created by canbay on 13.05.2017.
 */
public class Convoys {

    // facade for all convoys
    private RoadTrip convoyA;
    private RoadTrip convoyB;
    private RoadTrip convoyC;
    private RoadTrip convoyD;

    public Convoys(){
        convoyA = new ConvoyA();
        convoyB = new ConvoyB();
        convoyC = new ConvoyC();
        convoyD = new ConvoyD();
    }

    public void tripConvoyA(){
        convoyA.trip();
    }

    public void tripConvoyB(){
        convoyB.trip();
    }
    public void tripConvoyC(){
        convoyC.trip();
    }

    public void tripConvoyD(){
        convoyD.trip();
    }


}
