package dev.lpa;

import java.util.ArrayList;
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

    }
}
