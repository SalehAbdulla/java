package dev.lpa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        // using diamond operator to specify the data type
        LinkedList<String> placesToVisit = new LinkedList<>();

        // another way to declare a LinkedList is by using var keyword
        // we are declaring var type, because we will be using three LinkedList datatypes
        // List, Queue, and Dequeue
        var morePlacesToVisit = new LinkedList<String>();

        // we can use var keyword for any list type or collection
        // and when we do, we've to specify the dataType RHS <String>

        placesToVisit.add("Sydney");

        // calling overloaded add method using index this time
        placesToVisit.add(0, "Canberra");

        // Above methods are same as ArrayLists
        System.out.println("1st print = " + placesToVisit);


        // Because LinkedList functions as well from Deque interface a double-ended queue
        // It allows elements to be added or removed from both ends: the front (head) and the rear (tail).

        addMoreElements(placesToVisit);
        System.out.println("2nd print = " + placesToVisit);

//        removeElement(placesToVisit);
//        System.out.println("3rd print = " + placesToVisit);

//      gettingElements(placesToVisit);

        printItinerary(placesToVisit);

//        removeWithItinerary(placesToVisit);

        listIterator(placesToVisit);
    }

    // Let's create a method called more elements
    // to demonstrate Deque interface methods
    private static void addMoreElements(LinkedList<String> list) {

        // list methods - List
        list.addFirst("Darwin");     // Insert at the beginning
        list.addLast("Hobart");      // Insert at the end

        // Queue methods - Queue
        list.offer("Melbourne");         // Adds at the end (same as addLast)
        list.offerFirst("Brisbane");     // Adds at the front (same as addFirst)
        list.offerLast("Toowoomba");     // Adds at the end (same as addLast)

        // Stack methods - Deque
        list.push("Alice Springs");      // Pushes onto the "top" (same as addFirst)

        System.out.println("-".repeat(30));
    }


    private static void removeElement(LinkedList<String> list) {
        // List methods
        list.remove(4);
        list.remove("Brisbane");

        // LinkedList has additional method to remove elements
        // that are not in an ArrayLists - No-argument remove method

        System.out.println("Function Print = " + list);
        String s1 = list.remove(); // removes first element, save it in s1
        System.out.println("Using list.remove(), " + s1 + " 1st element was removed");

        System.out.println("-".repeat(30));

        System.out.println("Function Print = " + list);
        String s2 = list.removeFirst(); // removes first element, save it in s1
        System.out.println("Using list.removeFirst(), " + s2 + " 1st element was removed");
        // list.remove() & list.removeFirst() are the same, removeFirst() considered as cleaner code

        System.out.println("-".repeat(30));

        System.out.println("Function Print = " + list);
        String s3 = list.removeLast(); // removes Last element, save it in s1
        System.out.println("Using list.remove(), " + s3 + " last element was removed");

        System.out.println("-".repeat(30));

        // Queue/Dequeue methods for remove
        String p1 = list.poll(); // removes first Element
        System.out.println("Using list.poll(), " + p1 + " first element was removed");

        System.out.println("-".repeat(30));

        String p2 = list.pollFirst(); // removes first Element
        System.out.println("Using list.poll(), " + p2 + " first element was removed");

        System.out.println("-".repeat(30));

        String p3 = list.pollFirst(); // removes Last Element
        System.out.println("Using list.poll(), " + p3 + " Last element was removed");

        System.out.println("-".repeat(30));

        // Adding element using push stack method - list.push();
        // First Element In, First Element Out
        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");

        System.out.println("-".repeat(30));

        // Stack method
        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " was removed");

        System.out.println("-".repeat(30));
    }

    private static void gettingElements(LinkedList<String> list) {
        // List methods
        System.out.println("Retrieved 5th Element using .get(4) = " + list.get(4));
        System.out.println("First .getFirst() Element = " + list.getFirst());
        System.out.println("Last .getLast() Element = " + list.getLast());

        // was can use as well indexOf & lastIndexOf
        // to get the index if an element in a list
        // as we do in an ArrayList

        System.out.println("-".repeat(30));
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at: " + list.lastIndexOf("Melbourne"));

        System.out.println("-".repeat(30));

        // Queue retrieval methods
        // Since this is a Queue, then it is first in, first out
        // So, .element(), will get the first item.
        System.out.println("Element from .element() " + list.element()); // first element

        System.out.println("-".repeat(30));

        // Stack retrieval methods
        System.out.println("Element from .peek() " + list.peek());
        System.out.println("Element from .peekFirst() " + list.peekFirst());
        System.out.println("Element from .peekLast() " + list.peekLast());

    }
    //  Itinerary Examples

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
//        for (int i = 1; i < list.size(); i++) {
//            System.out.println("From " + list.get(i - 1) + " to " + list.get(i));
//        }

//        String temp = list.getFirst();
//        for (String place: list){
//            System.out.println("From " + temp + " to " + place);
//            temp = place;
//
//        }
        ListIterator<String> iterator = list.listIterator();

        String from = iterator.next();

        while (iterator.hasNext()) {
            var to = iterator.next();
            System.out.println("From " + from + " --> " + to);
            from = to;
        }


        System.out.println("Trip ends at " + list.getLast());
    }

    public static void removeWithItinerary(LinkedList<String> list) {
        System.out.println(list);
        var it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Brisbane")) {
                it.remove();
            }
        }
        System.out.println(list);
    }

    public static void listIterator(LinkedList<String> list) {

        System.out.println(list);
        
        // with listIterator, we have extra functionality
        var it = list.listIterator();
        while (it.hasNext()) {
            if (it.next().equals("Brisbane")) {
                it.add("Bahrain");
            }
        }

        while (it.hasPrevious()){
            System.out.println(it.previous());
        }

        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());

    }
}