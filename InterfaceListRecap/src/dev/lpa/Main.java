package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", name.toUpperCase(), type, count);
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apple", "DAIRY", 2);
        groceryArray[2] = new GroceryItem("Oranges");
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add(new GroceryItem("Butter"));
        objectList.add(new GroceryItem("Banana"));
        objectList.add("Something like a String");
        System.out.println(objectList);

        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Apple"));
        groceryItems.add(new GroceryItem("Orange"));
        groceryItems.add(new GroceryItem("Banana"));

        // add a new value, specifying at which index
        groceryItems.add(0, new GroceryItem("watermelon"));

        // Replace a value using .set method
        groceryItems.set(1, new GroceryItem("beach"));

        // Remove a value, by index
        groceryItems.remove(2);

        System.out.println(groceryItems);

    }
}