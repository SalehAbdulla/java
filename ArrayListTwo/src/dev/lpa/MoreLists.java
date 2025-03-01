package dev.lpa;

import java.util.ArrayList;
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
        //list.add("yogurt");

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


    }
}
