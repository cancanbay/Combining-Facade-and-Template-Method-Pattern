package Convoy;

import Trip.RoadTrip;

/**
 * Created by canbay on 13.05.2017.
 */
public class ConvoyD extends RoadTrip {

    @Override
    public void moveDestination() {
        System.out.println("Convoy D is moving to the destination Amsterdam,Netherlands.");
    }

    @Override
    public void doTouristicTravelDay1() {
        System.out.println("Convoy D is going to VondelPark,Stedelijk Museum respectively in day 1.");
    }

    @Override
    public void doEntertainingTravelDay1() {
        System.out.println("Convoy D is going to Paradiso night club for night in day 2.");
    }

    @Override
    public void doTouristicTravelDay2() {
        System.out.println("Convoy D is going to Van Gogh Museum,Heineken Experience respectively in day 2.");
    }

    @Override
    public void doEntertainingTravelDay2() {
        System.out.println("Convoy D is going to Jimmy Woo night club for night in day 2.");
    }

    @Override
    public void doTouristicTravelDay3() {
        System.out.println("Convoy D is going to Begijnhof,Het Rembrandthuis Museum respectively in day 3.");
    }

    @Override
    public void doEntertainingTravelDay3() {
        System.out.println("Convoy D is going to Escape night club for night in day 3.");
    }
}
