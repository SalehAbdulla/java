package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
        // Array of type String
        String[] item = {"apples", "bananas", "milk", "eggs"};

        // print the array
        System.out.println(Arrays.toString(item));

        // Turn the Array into a listed
        List<String> list = List.of(item);
        System.out.println(list);

        // ArrayList of type String -- Adding the list before
        ArrayList<String> groceriesArrayList = new ArrayList<>(list);

        groceriesArrayList.add("Chocolate");
        System.out.println(groceriesArrayList);

        // Another ArrayList of type string -- Adding the list directly
        ArrayList<String> anotherArrayList = new ArrayList<>(List.of("cheese", "salami", "mustard"));
        System.out.println(anotherArrayList);

        groceriesArrayList.addAll(anotherArrayList);
        System.out.println(groceriesArrayList);

        // Get the third item
        System.out.println("Third Item = " + groceriesArrayList.get(2));

        if (groceriesArrayList.contains("mustard")){
            System.out.println("List contain mustard");
        }

        groceriesArrayList.add("yogurt");
        System.out.println(groceriesArrayList.indexOf("yogurt"));
        System.out.println(groceriesArrayList.lastIndexOf("yogurt"));

        System.out.println(groceriesArrayList);

        groceriesArrayList.remove("yogurt");
        System.out.println(groceriesArrayList);

        groceriesArrayList.removeAll(List.of("apples", "eggs"));
        System.out.println(groceriesArrayList);

        groceriesArrayList.retainAll(List.of("apple", "milk", "cheese"));
        System.out.println(groceriesArrayList);






    }


}