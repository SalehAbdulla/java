package dev.lpa;

import java.util.LinkedList;

public class MorePractice {
    public static void main(String[] args) {

        LinkedList<Location> locationToVisitAgain = new LinkedList<>();
        add(new Location("Bahrain", 110), locationToVisitAgain);
        add(new Location("Saudi", 135), locationToVisitAgain);
        add(new Location("Qatar", 0), locationToVisitAgain);
        System.out.println(locationToVisitAgain);
    }

    public static void add(Location place, LinkedList<Location> list) {
        for (Location l : list) {
            if (l.name().equalsIgnoreCase(place.name())) {
                return;
            }
        }

        // Addition lowest to highest
        int trackingIndex = 0;
        for (Location l : list) {
            if (place.distance() < l.distance()) {
                list.add(trackingIndex, place);
                return;
            }
            trackingIndex++;
        }
        list.add(place);
    }

}