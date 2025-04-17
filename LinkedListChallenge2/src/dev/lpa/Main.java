package dev.lpa;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place bahrain = new Place("Bahrain", 110);
        Place saudi = new Place("Saudi", 135);

        addPlace(bahrain, placesToVisit);
        addPlace(saudi, placesToVisit);

        addPlace(new Place("Kuwait", 118), placesToVisit);
        addPlace(new Place("bahrain", 110), placesToVisit);

        System.out.println(placesToVisit);

    }


    public static void addPlace(Place place, LinkedList<Place> list){

        for (Place p : list){
            if (p.name().equalsIgnoreCase(place.name())){
                return;
            }
        }

        list.add(place);

    }

}