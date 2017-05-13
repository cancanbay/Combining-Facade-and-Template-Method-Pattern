package Convoy;

import Trip.RoadTrip;

/**
 * Created by canbay on 13.05.2017.
 */
public class ConvoyB extends RoadTrip {

    @Override
    public void moveDestination() {
        System.out.println("Convoy B is moving to the destination Rome,Italy.");
    }

    @Override
    public void doTouristicTravelDay1() {
        System.out.println("Convoy B is going to Colloseum,Pantheon respectively in day 1.");
    }

    @Override
    public void doEntertainingTravelDay1() {
        System.out.println("Convoy B is going to Trastevere for night in day 1.");
    }

    @Override
    public void doTouristicTravelDay2() {
        System.out.println("Convoy B is going to Piazza Navona,Vatican Museum respectively in day 2.");
    }

    @Override
    public void doEntertainingTravelDay2() {
        System.out.println("Convoy B is going to La Casa del Jazz for night in day 2.");
    }

    @Override
    public void doTouristicTravelDay3() {
        System.out.println("Convoy B is going to Foro Romano,Castel Saint D'Angelo respectively in day 3.");
    }

    @Override
    public void doEntertainingTravelDay3() {
        System.out.println("Convoy B is going to Via del Politeama for night in day 3.");
    }


}
