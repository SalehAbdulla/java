package dev.lpa;

import java.util.LinkedList;

record Place(String name, int distance){

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place bahrain = new Place("Bahrain", 1234);

        addPlace(placesToVisit, bahrain);
        addPlace(placesToVisit, new Place("bahrain", 1234));
        System.out.println(placesToVisit);

    }

    private static void addPlace(LinkedList<Place> list, Place place) {
//        if (list.contains(place)){
//            System.out.println("Found duplicate " + place);
//            return;
//        }

        for (Place p: list){
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found Duplicate: " + place);
            }
            return;
        }


        // 6.48

        list.add(place);
    }
}