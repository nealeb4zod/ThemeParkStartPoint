package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor underSixteen;
    Visitor overFifteen;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        underSixteen = new Visitor(15, 150, 10.00);
        overFifteen = new Visitor(16, 150, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canVisitUnderSixteen() {
        assertTrue(playground.isAllowedTo(underSixteen));
    }

    @Test
    public void canVisitOverFifteen() {
        assertFalse(playground.isAllowedTo(overFifteen));
    }
}
