package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor underEighteen;
    Visitor overSeventeen;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 2);
        underEighteen = new Visitor(17, 150, 10.00);
        overSeventeen = new Visitor(18, 150, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canVisitUnderEightteen() {
        assertFalse(tobaccoStall.isAllowedTo(underEighteen));
    }

    @Test
    public void canVisitOverFifteen() {
        assertTrue(tobaccoStall.isAllowedTo(overSeventeen));
    }

    @Test
    public void hasRating() {
        assertEquals(2, tobaccoStall.getRating());
    }
}
