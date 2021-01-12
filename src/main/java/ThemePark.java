import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> stallsAndAttractions;

    public ThemePark(ArrayList<IReviewed> stallsAndAttractions){
        this.stallsAndAttractions = stallsAndAttractions;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return stallsAndAttractions;
    }
}
