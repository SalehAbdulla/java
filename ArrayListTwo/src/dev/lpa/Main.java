package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }
}

public class Main {
    public static void main(String[] args) {

        // an object array with length of 3
        GroceryItem[] groceryArray = new GroceryItem[3];

        groceryArray[0] = new GroceryItem("milk");
        System.out.println(Arrays.toString(groceryArray));

        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        System.out.println(Arrays.toString(groceryArray));

        groceryArray[2] = new GroceryItem("yogurt");
        System.out.println(Arrays.toString(groceryArray));

        System.out.println("-".repeat(30));

        ArrayList objectArrayList = new ArrayList();
        objectArrayList.add(new GroceryItem("Butter"));
        objectArrayList.add("String");
        System.out.println(objectArrayList);

        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Butter"));
        groceryItems.add(new GroceryItem("Yogurt"));




    }
}
