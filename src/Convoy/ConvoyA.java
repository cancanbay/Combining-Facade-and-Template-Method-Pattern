package Convoy;

import Trip.RoadTrip;

/**
 * Created by canbay on 13.05.2017.
 */

public class ConvoyA extends RoadTrip {

    @Override
    public void moveDestination() {
        System.out.println("Convoy A is moving to the destination Berlin,Germany.");
    }

    @Override
    public void doTouristicTravelDay1() {
        System.out.println("Convoy A is going to Reichstag,Berlin Wall respectively in day 1.");
    }

    @Override
    public void doEntertainingTravelDay1() {
        System.out.println("Convoy A is going to Berghain night club for night.");
    }

    @Override
    public void doTouristicTravelDay2() {
        System.out.println("Convoy A is going to Brandenburger and East Side Gallery respectively in day 2.");
    }

    @Override
    public void doEntertainingTravelDay2() {
        System.out.println("Convoy A is going to Lab Oratory night club for night.");
    }
    @Override
    public void doTouristicTravelDay3() {
        System.out.println("Convoy A is going to Spree,Checkpoint Charlie respectively in day 3.");
    }

    @Override
    public void doEntertainingTravelDay3() {
        System.out.println("Convoy A is going to About Blank night club for night.");
    }

}
