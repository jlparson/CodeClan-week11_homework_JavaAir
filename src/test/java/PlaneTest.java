import flight.Plane;
import flight.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(366, plane.getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(412770, plane.getWeight());
    }

}
