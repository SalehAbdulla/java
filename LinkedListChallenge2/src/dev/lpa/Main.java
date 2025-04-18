package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

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

        // using a list Iterator
        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);

        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            System.out.println("Enter a value");
            String userInput = scanner.nextLine().toUpperCase().substring(0, 1);

            // if node doesn't have a previous, this means we are at the beginning
            if (!iterator.hasPrevious()) {
                System.out.println("First node - No more previous");
                forward = true;
            }
            // if node doesn't have a next, this means we are at the end
            if (!iterator.hasNext()) {
                System.out.println("Last node - No more next ");
                forward = false;
            }

            switch (userInput) {
                case "F":
                    System.out.println("Going forward ...");
                    if (iterator.hasNext()) System.out.println(iterator.next());
                    break;

                case "B":
                    System.out.println("Going backward ...");
                    if (iterator.hasPrevious()) System.out.println(iterator.previous());

                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    printMenu();
                    break;
                default:
                    quitLoop = true;
            }

        }


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


    public static void printMenu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }


}
