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

        // Adding or joining elements - two ArrayList
        arrayListTwo.addAll(groceryArrayList);
        System.out.println(arrayListTwo);

        System.out.println("Third item = " + arrayListTwo.get(2));

        System.out.println("-".repeat(30));


        groceryArrayList.add("yogurt");
        System.out.println(groceryArrayList);


        if (groceryArrayList.contains("yogurt")){
            System.out.println("Grocery ArrayList contains yogurt");
        }

        System.out.println("First yogurt = " + groceryArrayList.indexOf("yogurt"));
        System.out.println("Second yogurt = " + groceryArrayList.lastIndexOf("yogurt"));


        System.out.println(groceryArrayList);

        groceryArrayList.remove(1);
        System.out.println(groceryArrayList);

        groceryArrayList.removeAll(List.of("eggs", "yogurt"));
        System.out.println(groceryArrayList);



        


    }
}
