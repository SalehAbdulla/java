package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);

        System.out.println(list);
        System.out.println("Data type = " + list.getClass().getName());

        ArrayList<String> groceryArrayList = new ArrayList<>(list);
        groceryArrayList.add("yogurt");
        System.out.println(groceryArrayList);


        ArrayList<String> arrayListTwo = new ArrayList<>(List.of("Red", "Green", "Blue"));
        System.out.println(arrayListTwo);

        // Adding or joining elements from two ArrayList
        arrayListTwo.addAll(groceryArrayList);
        System.out.println(arrayListTwo);


    }
}
