package dev.lpa;

import java.util.LinkedList;

record Place(String place, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", place, distance);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        // Testing 1
        add(new Place("Bahrain", 135), placesToVisit);
        add(new Place("Saudi", 110), placesToVisit);
        add(new Place("Qatar", 118), placesToVisit);
        add(new Place("Saudi", 110), placesToVisit);

        System.out.println(placesToVisit);
    }

    // Add function, sort entry by distance, and don't allow duplication
    public static void add(Place place, LinkedList<Place> linkedList) {
        if (linkedList.contains(place)) {
            System.out.println("Duplication found: " + place);
            return;
        }

        // iteration tracker if value less, then insert new place, so the list becomes sorted
        int indexTracker = 0;
        for (Place l : linkedList) {
            if (place.distance() < l.distance()) {
                linkedList.add(indexTracker, place);
                return;
            }
            indexTracker++;
        }

        linkedList.add(place);
    }
}
