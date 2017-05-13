package Convoy;

import Trip.RoadTrip;

/**
 * Created by canbay on 13.05.2017.
 */
public class ConvoyC extends RoadTrip {

    @Override
    public void moveDestination() {
        System.out.println("Convoy C is moving to the destination Barcelona,Spain.");
    }

    @Override
    public void doTouristicTravelDay1() {
        System.out.println("Convoy C is going to La Rambla,Sagrada Familia respectively in day 1.");
    }

    @Override
    public void doEntertainingTravelDay1() {
        System.out.println("Convoy C is going to Pasha night club for night in day 1.");
    }

    @Override
    public void doTouristicTravelDay2() {
        System.out.println("Convoy C is going to Camp Nou,Casa Milà respectively in day 2.");
    }

    @Override
    public void doEntertainingTravelDay2() {
        System.out.println("Convoy C is going to Saoko night club for night in day 2.");
    }

    @Override
    public void doTouristicTravelDay3() {
        System.out.println("Convoy C is going to Park Güell,Barri Gotic respectively in day 3.");
    }

    @Override
    public void doEntertainingTravelDay3() {
        System.out.println("Convoy C is going to Sidecar Factory night club for night in day 3.");
    }
}
