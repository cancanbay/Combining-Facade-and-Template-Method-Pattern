package Trip;

/**
 * Created by canbay on 13.05.2017.
 */
public abstract class RoadTrip {

    // template method trip that has other methods inside.
    public void trip(){
        moveDestination();
        doTouristicTravelDay1();
        doEntertainingTravelDay1();
        sleep();
        doTouristicTravelDay2();
        doEntertainingTravelDay2();
        sleep();
        doTouristicTravelDay3();
        doEntertainingTravelDay3();
        backHome();
    }

    public abstract void moveDestination();
    public abstract void doTouristicTravelDay1();
    public abstract void doTouristicTravelDay2();
    public abstract void doTouristicTravelDay3();
    public abstract void doEntertainingTravelDay1();
    public abstract void doEntertainingTravelDay2();
    public abstract void doEntertainingTravelDay3();

    public void sleep(){
        System.out.println("All members of convoy is sleeping zZz...");
    }

    public void backHome(){
        System.out.println("The funny trip is over, convoy is coming back to home!");
    }



}
