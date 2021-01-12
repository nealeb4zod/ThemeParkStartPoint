package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor tooShortAndYoung;
    Visitor tooShortOldEnough;
    Visitor tallEnoughTooYoung;
    Visitor tallEnoughOldEnough;
    Visitor overTwoHundred;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tooShortAndYoung = new Visitor(12,145,10.00);
        tooShortOldEnough = new Visitor(13,145,10.00);
        tallEnoughTooYoung = new Visitor(12,146,10.00);
        tallEnoughOldEnough = new Visitor(13,146,10.00);
        overTwoHundred = new Visitor(13, 201,10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void tooShortAndYoung(){
        assertFalse(rollerCoaster.isAllowedTo(tooShortAndYoung));
    }

    @Test
    public void tooShortOldEnough(){
        assertFalse(rollerCoaster.isAllowedTo(tooShortOldEnough));
    }

    @Test
    public void tallEnoughTooYoung(){
        assertFalse(rollerCoaster.isAllowedTo(tallEnoughTooYoung));
    }

    @Test
    public void tallEnoughOldEnough(){
        assertTrue(rollerCoaster.isAllowedTo(tallEnoughOldEnough));
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void getUnderTwelvePrice() {
        assertEquals(8.40, rollerCoaster.priceFor(tooShortAndYoung), 0.01);
    }

    @Test
    public void getOverElevenPrice() {
        assertEquals(16.80, rollerCoaster.priceFor(overTwoHundred), 0.01);
    }
}
