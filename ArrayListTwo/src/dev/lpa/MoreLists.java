package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        // this is an ArrayList
        String[] items = {"apples", "bananas", "milk", "eggs"};

        // this is a List, passing in the values of ArrayList above.
        // Also called factory method, transform an ArrayList into a List
        List<String> list = List.of(items);
        System.out.println(list.getClass().getName());
        // immutable list - we can't add a value to it
        // list.add("yogurt");

        // transform the immutable list into ArrayList
        ArrayList<String> groceriesFirstArrayList = new ArrayList<>(list);
        groceriesFirstArrayList.add("yogurt");
        System.out.println(groceriesFirstArrayList);

        // now the problem of immutable List has been solved.
        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        // Add previous ArrayList to firstArrayList we've created
        groceriesFirstArrayList.addAll(nextList);
        System.out.println(groceriesFirstArrayList);

        System.out.println("Third element is = " + groceriesFirstArrayList.get(2));
        if (groceriesFirstArrayList.contains("mustard")){
            System.out.println("List contains mustard");
        }

        groceriesFirstArrayList.add("yogurt");
        System.out.println("first = " + groceriesFirstArrayList.indexOf("yogurt"));
        System.out.println("last = " + groceriesFirstArrayList.lastIndexOf("yogurt"));

        // Also we can remove an element either by its index or element value
        System.out.println(groceriesFirstArrayList);
        groceriesFirstArrayList.remove("yogurt");
        System.out.println(groceriesFirstArrayList);

        // if we want to remove many elements at a time, we'll need the static method List.of();
        groceriesFirstArrayList.removeAll(List.of("apples", "eggs"));
        System.out.println(groceriesFirstArrayList);

        // remove everything except -- retainAll
        groceriesFirstArrayList.retainAll(List.of("milk", "pickles"));
        System.out.println(groceriesFirstArrayList);

        // clear ArrayList
        groceriesFirstArrayList.clear();
        System.out.println(groceriesFirstArrayList);

        System.out.println("ArrayList is empty = " + groceriesFirstArrayList.isEmpty());

        System.out.println("-".repeat(30));

        groceriesFirstArrayList.addAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceriesFirstArrayList);
        // another way to add elements
        groceriesFirstArrayList.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceriesFirstArrayList);

        // sort an Array
        groceriesFirstArrayList.sort(Comparator.naturalOrder());
        System.out.println(groceriesFirstArrayList);

        // reverse an ArrayList
        groceriesFirstArrayList.sort(Comparator.reverseOrder());
        System.out.println(groceriesFirstArrayList);

        // transfer an ArrayList into Array

        var groceryArray = groceriesFirstArrayList.toArray(new String[groceriesFirstArrayList.size()]);
        System.out.println(Arrays.toString(groceryArray));



    }
}
