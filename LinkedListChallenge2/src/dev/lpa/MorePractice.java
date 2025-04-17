package dev.lpa;

record Places(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class MorePractice {
    public static void main(String[] args) {

        LinkedList<Location> locationToVisitAgain = new LinkedList<>();
        add(new Location("Bahrain", 110), locationToVisitAgain);
        add(new Location("Saudi", 135), locationToVisitAgain);
        System.out.println(locationToVisitAgain);
    }

    public static void add(Location place, LinkedList<Location> list){
        for (Location l: list) {
            if (l.name().equalsIgnoreCase(place.name())){
                return;
            }
        }
        list.add(place);
    }

}