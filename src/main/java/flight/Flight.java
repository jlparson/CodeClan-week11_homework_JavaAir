package flight;

import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String destinationAirport;
    private String departureTime;

    public Flight(Pilot pilot, CabinCrewMember cabinCrewMember, Plane plane, String flightNumber, String destination, String destinationAirport, String departureTime){
        this.pilot = pilot;
        this.cabinCrewMember = cabinCrewMember;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
    }


    public Pilot getPilot(){
        return this.pilot;
    }

    public CabinCrewMember getCabinCrewMember(){
        return this.cabinCrewMember;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDestinationAirport() {
        return this.destinationAirport;
    }

    public Object getDepartureTime() {
        return this.departureTime;
    }

    public int capacity(){
        return plane.getCapacity();
    }

    public int remainingSeats() {
        return this.capacity() - this.passengerCount();
    }

    public boolean isFullNoRemainingSeats(){
        return this.capacity() == this.passengerCount();
    }

    public void bookPassenger(Passenger passenger) {
        if(!isFullNoRemainingSeats()){
            this.passengers.add(passenger);
        }
    }
}
