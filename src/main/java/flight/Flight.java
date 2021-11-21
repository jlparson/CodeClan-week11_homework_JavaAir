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

    public int passengerCount() {
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getDestination() {
        return destination;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public Object getDepartureTime() {
        return departureTime;
    }



}
