import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.PersonRank;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Karen", PersonRank.FIRSTOFFICER);
    }

    @Test
    public void hasName(){
        assertEquals("Karen", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(PersonRank.FIRSTOFFICER, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessagesToPassengers(){
        assertEquals("Passengers, can I have your attention please...", cabinCrewMember.relayMessageToPassengers());
    }
}
