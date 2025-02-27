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
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("MILK");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        System.out.println("-".repeat(30));

        // if we did not explicitly specify the type of the list, then by default it will be a list of Objects
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        System.out.println("-".repeat(30));

        // All elements are GroceryItem
        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Milk"));
        groceryItems.add(new GroceryItem("Butter"));
        System.out.println(groceryItems);

        

    }
}
