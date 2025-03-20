package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name, type);
    }
}


public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList<>();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
        System.out.println(objectList);

        // Specifying the data type in an ArrayList

        ArrayList<GroceryItem> groceryItemArrayList = new ArrayList<>();
        groceryItemArrayList.add(new GroceryItem("Butter"));
        groceryItemArrayList.add(new GroceryItem("milk"));
        groceryItemArrayList.add(new GroceryItem("oranges", "PRODUCE", 6));

        // Replace an element
        groceryItemArrayList.set(0, new GroceryItem("apples", "PRODUCE", 6));

        // Remove an element
        groceryItemArrayList.remove(0);

        System.out.println(groceryItemArrayList);



    }
}