import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> stallsAndAttractions;

    public ThemePark(){
        this.stallsAndAttractions = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return stallsAndAttractions;
    }

    public int getStallsAndAttractionsSize() {
        return stallsAndAttractions.size();
    }

    public void add(IReviewed place) {
        stallsAndAttractions.add(place);
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addAttraction(attraction);
    }
}
