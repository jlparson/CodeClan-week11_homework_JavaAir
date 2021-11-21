import flight.Flight;
import flight.Plane;
import flight.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Passenger;
import people.PersonRank;
import people.Pilot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private ArrayList<Passenger> passengers;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before() {
        pilot = new Pilot("Zsolt", PersonRank.CAPTAIN, "L12345");
        cabinCrewMember = new CabinCrewMember("Przemyslaw", PersonRank.FIRSTOFFICER);
        passengers = new ArrayList<Passenger>();
        passenger1 = new Passenger("Jenny", 2);
        passenger2 = new Passenger("Marion", 3);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, cabinCrewMember, plane, "FR4524", "Warsaw", "WMI", "15:05");
    }

    @Test
    public void hasEmptyPassengerListToStart(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR4524", flight.getPlane());
    }

    @Test
    public void hasDestination(){
        assertEquals("Warsaw", flight.getDestination());
    }

    @Test
    public void hasDestinationAirport(){
        assertEquals("WMI", flight.getDestinationAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("15:05", flight.getDepartureTime());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(2, flight.passengerCount());
    }



}
