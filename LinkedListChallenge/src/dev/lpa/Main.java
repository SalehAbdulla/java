package dev.lpa;

import java.util.LinkedList;

record Place(String name, int distance) {
    @Override
    public String toString(){
        return String.format("%s (%d)", name, distance);
    }
}


public class Main {
    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        System.out.println(placesToVisit);

        Place place1 = new Place("place1", 1);
        Place place2 = new Place("place2", 6);
        Place place3 = new Place("place3", 5);
        Place place4 = new Place("place4", 4);
        Place place5 = new Place("place5", 3);
        Place place6 = new Place("place6", 2);



        System.out.println(placesToVisit);
    }

    private static void addPlace(LinkedList<Place> list, Place place){

        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;

        for (var listPlace: list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
            }
            matchedIndex++;
        }
        list.add(place);
    }

}