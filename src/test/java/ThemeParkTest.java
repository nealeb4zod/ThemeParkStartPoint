import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThemeParkTest {

    Visitor visitor;

    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;

    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    ThemePark themePark;

    @Before
    public void before() {
        visitor = new Visitor(18, 190, 10.00);

        dodgems = new Dodgems("Dodgems", 9);
        park = new Park("Park", 8);
        playground = new Playground("Playground", 3);
        rollerCoaster = new RollerCoaster("Roller Coaster", 9);

        candyflossStall = new CandyflossStall("Candy Floss Stall", "Big Dave", ParkingSpot.A1, 8);
        iceCreamStall = new IceCreamStall("Ice Cream Stall", "Wee Dave", ParkingSpot.B1, 9);
        tobaccoStall = new TobaccoStall("Tobacco Stall", "Medium Dave", ParkingSpot.B3,1);

        themePark = new ThemePark();
    }

    @Test
    public void addDodgems(){
        themePark.add(dodgems);
        assertTrue(themePark.getAllReviewed().contains(dodgems));
    }

    @Test
    public void addPark(){
        themePark.add(park);
        assertTrue(themePark.getAllReviewed().contains(park));
    }

    @Test
    public void addPlayground(){
        themePark.add(playground);
        assertTrue(themePark.getAllReviewed().contains(playground));
    }

    @Test
    public void addRollerCoaster(){
        themePark.add(rollerCoaster);
        assertTrue(themePark.getAllReviewed().contains(rollerCoaster));
    }

    @Test
    public void addCandyflossStall(){
        themePark.add(candyflossStall);
        assertTrue(themePark.getAllReviewed().contains(candyflossStall));
    }

    @Test
    public void addIceCreamStall(){
        themePark.add(iceCreamStall);
        assertTrue(themePark.getAllReviewed().contains(iceCreamStall));
    }

    @Test
    public void addTobaccoStall(){
        themePark.add(tobaccoStall);
        assertTrue(themePark.getAllReviewed().contains(tobaccoStall));
    }

    @Test
    public void canVisitAttraction() {
        themePark.visit(visitor, dodgems);
        assertEquals(1, dodgems.getVisitCount());
    }

}
