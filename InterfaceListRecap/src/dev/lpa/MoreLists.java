package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apple", "orange", "milk", "egg"};

        // inject items into a List, List.of is immutable static method -- no add, remove & even modify.
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());
        // This won't work
        // list.add("Something");

        // To solve it, we can convert it into an ArrayList
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Something");
        System.out.println(groceries);
        System.out.println(groceries.getClass().getName());

        // Instead of adding an element each time, we can simply add it directly from the beginning
        ArrayList<String> arrayListComesWithValues = new ArrayList<>(List.of("Apple", "Orange", "Banana"));
        System.out.println(arrayListComesWithValues);

        // There is another method to add all the element one time
        ArrayList<String> usingAddAllArrayList = new ArrayList<>();
        usingAddAllArrayList.addAll(List.of("Apple", "Orange", "Banana"));
        System.out.println(usingAddAllArrayList);

        // Array we use [], whereas Arraylist we use .get()
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(List.of("one", "two", "three"));

        // Check if an element exists in an ArrayList
        if (newArrayList.contains("one")) {
            System.out.println("List contains one");
        }

        newArrayList.add("fourthElement");
        newArrayList.add("fourthElement");

        System.out.println(newArrayList);
        System.out.println("First time 'fourthElement' occurs = " + newArrayList.indexOf("fourthElement"));
        System.out.println("Last time 'fourthElement' occurs = " + newArrayList.lastIndexOf("fourthElement"));

        System.out.println(newArrayList);

        // remove by index
        newArrayList.remove(1);

        // remove by element name
        newArrayList.remove("one");

        // remove many elements together
        newArrayList.removeAll(List.of("two", "three"));
        System.out.println(newArrayList);

        // retain - remove all element except what mentioned
        newArrayList.retainAll(List.of("fourthElement"));
        System.out.println(newArrayList);

        // Clear the list clear()
        newArrayList.clear();
        System.out.println("ArrayList isEmpty? " + newArrayList.isEmpty());
        System.out.println(newArrayList);

        // Let's add new items
        newArrayList.addAll(List.of("saleh", "ahmed", "mahdi", "abdulla"));

        // this time add items with Arrays.asList
        // Mutable, NOT resizable
        newArrayList.addAll(Arrays.asList("fatima", "zainab", "zahra"));

        System.out.println(newArrayList);

        // Sort the elements
        newArrayList.sort(Comparator.naturalOrder());
        System.out.println(newArrayList);

        // Convert all elements into uppercase
        int counter = 0;
        for (String item : newArrayList) {
            newArrayList.set(counter, item.toUpperCase());
            counter++;
        }
        System.out.println(newArrayList);

        // reverse order this time
        newArrayList.sort(Comparator.reverseOrder());
        System.out.println(newArrayList);


        // Convert ArrayList to Array, .toArray(new String[ArrayList.size()])
        var newArrayListToArray = newArrayList.toArray(new String[newArrayList.size()]);
        System.out.println(Arrays.toString(newArrayListToArray));



    }
}
