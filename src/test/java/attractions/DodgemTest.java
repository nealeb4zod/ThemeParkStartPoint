package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor underTwelve;
    Visitor overEleven;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        underTwelve = new Visitor(11, 130, 10.00);
        overEleven = new Visitor(12, 130, 10.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void getUnderTwelvePrice() {
        assertEquals(2.25, dodgems.priceFor(underTwelve), 0.01);
    }

    @Test
    public void getOverElevenPrice() {
        assertEquals(4.50, dodgems.priceFor(overEleven), 0.01);
    }

    @Test
    public void canIncrementVisitCount() {
        dodgems.incrementVisitCount();
        assertEquals(1, dodgems.getVisitCount());
    }
}
