package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {

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
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 1234));
        placesToVisit.addFirst(new Place("Sydney", 0));

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false, forward = true;

        printMenu();
        while (!quitLoop){
            // This means the list we're at the start of the list
            if (!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            // This means we're at the end of the list
            if (!iterator.hasNext()){
                System.out.println("Final : " + iterator.next());
                forward = false;
            }


            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem){

                case "F":
                    System.out.println("User wants to go forward");
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backward");
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println("User wants to list places");
                    break;
                case "M":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }

        }

        System.out.println(placesToVisit);

    }

    private static void addPlace(LinkedList<Place> list, Place place) {
//        if (list.contains(place)){
//            System.out.println("Found duplicate " + place);
//            return;
//        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found Duplicate: " + place);
            }
            return;
        }

        int matchedIndex = 0;

        for (var listPlace: list) {
            if (place.distance() < listPlace.distance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }

        list.add(place);

    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }



}