package dev.lpa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MorePractice {
    public static void main(String[] args) {
        LinkedList<Location> location = new LinkedList<>();
        add(new Location("Bahrain", 135), location);
        add(new Location("Saudi", 110), location);
        add(new Location("Qatar", 118), location);
        System.out.println(location);


        // I'm The One

        var iteration = location.listIterator();
        Scanner scanner = new Scanner(System.in);
//
        printMenu();


        boolean quitLoop = false;

        while (!quitLoop) {
            System.out.println("Enter a value");
            String userInput = scanner.nextLine().toUpperCase().substring(0, 1);


            if (!iteration.hasPrevious()) {
                System.out.println("First Node");
            }
            if (!iteration.hasNext()) {
                System.out.println("Last Node");
            }

            switch (userInput) {

                // Forward
                case "F":
                    if (iteration.hasNext()) {
                        System.out.println(iteration.next());
                    }
                    break;
                case "B":
                    if (iteration.hasPrevious()) {
                        System.out.println(iteration.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(location);
                    break;
                default:
                    System.out.println("Exiting ...");
                    quitLoop = true;
                    break;
            }
        }


    }


    public static void add(Location location, LinkedList<Location> list) {

        // add method, no duplication and sorted
        for (Location l : list) {
            if (l.name().equalsIgnoreCase(location.name())) {
                System.out.println("Duplication Found: " + location);
                return;
            }
        }

        // since we ensured this is not a duplicant, adding now with sort
        int trackingIndex = 0;
        for (Location l : list) {
            if (location.distance() < l.distance()) {
                list.add(trackingIndex, location);
                return;
            }
            trackingIndex++;
        }
        // In case this is the first value
        list.add(location);
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