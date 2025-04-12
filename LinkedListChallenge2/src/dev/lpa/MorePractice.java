//package dev.lpa;
//
//import java.util.LinkedList;
//
//record Location(String name, int distance) {
//    @Override
//    public String toString() {
//        return String.format("%s (%d)", name, distance);
//    }
//}
//
//public class MorePractice {
//    public static void main(String[] args) {
//
//        LinkedList<Location> placesToVisit = new LinkedList();
//
//        Location bahrain = new Location("Bahrain", 729);
//        Location kuwait = new Location("Kuwait", 123);
//
//        addLocation(bahrain, placesToVisit);
//        addLocation(kuwait, placesToVisit);
//
//        System.out.println(placesToVisit);
//
//    }
//
//    private static void addLocation(Location location, LinkedList<Location> list) {
//
//        // if duplicates
//        for (Location l : list) {
//            if (l.name().equalsIgnoreCase(location.name())) {
//                System.out.println("Duplicate Found: " + location);
//                return;
//            }
//
//        }
//
//        // sorted distance short to long
//        int matchedIndex = 0;
//
//        for (Location l : list) {
//            if (l.distance() < location.distance()) {
//                list.add(matchedIndex, location);
//                return;
//            }
//            matchedIndex++;
//        }
//
//        list.add(location);
//    }
//}
