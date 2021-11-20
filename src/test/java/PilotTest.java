import org.junit.Before;
import org.junit.Test;
import people.PersonRank;
import people.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Zsolt", PersonRank.CAPTAIN, "L12345");
    }

    @Test
    public void hasName(){
        assertEquals("Zsolt", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(PersonRank.CAPTAIN, pilot.getPersonRank());
    }

    @Test
    public void hasPilotLicenceNumber(){
        assertEquals("L12345", pilot.getPilotLicence());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("I'm flying a plane!!!", pilot.flyPlane());
    }
}
