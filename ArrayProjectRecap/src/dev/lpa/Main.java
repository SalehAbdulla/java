package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }

}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];

        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("orange", "PRODUCE", 5);

        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryItems = new ArrayList<>();

        groceryItems.add(new GroceryItem("Butter"));
        groceryItems.add(new GroceryItem("Milk"));
        groceryItems.add(new GroceryItem("Butter", "PRODUCE", 4));

        groceryItems.set(0, new GroceryItem("apples", "PRODUCE", 6));
        groceryItems.remove(1);

        System.out.println(groceryItems);

    }

}