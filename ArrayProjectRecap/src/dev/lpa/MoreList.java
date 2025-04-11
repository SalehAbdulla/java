package dev.lpa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        //System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        //System.out.println(groceries);

        ArrayList<String> nextArrayList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));

        // We can get the element in an ArrayList using .get() method
        //System.out.println("Third item = " + nextArrayList.get(2));

        // As a boolean return, we can check of an element does exist
        if (nextArrayList.contains("mustard")) {
            //System.out.println("nextArrayList contains mustard");
        }

        // This will add an  item at the end of the ArrayList
        nextArrayList.add("yogurt");

        // indexOf("yogurt") will return the index of the element
        //System.out.println("indexOf('yogurt') = " + nextArrayList.indexOf("yogurt"));

        nextArrayList.add("yogurt");
        // return the last index on an element
        //System.out.println("lastIndexOf('yogurt') = " + nextArrayList.lastIndexOf("yogurt"));

        // We can remove any element, either by its index or value
        groceries.remove(1);
        groceries.remove("yogurt");
        //System.out.println(groceries);

        // Remove a list of element.
        groceries.removeAll(List.of("mustard", "apple"));

        // Retain - Removes everything and retain the list elements passed in
        groceries.retainAll(List.of("apple", "orange"));

        // remove everything from the list
        groceries.clear();
        //System.out.println(groceries);
        //System.out.println("isEmpty = " + groceries.isEmpty());

        // There are two ways to add elements, either by using List.of() static class or Arrays.asList()
        groceries.addAll(List.of("apple", "mild", "mustard"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        //  Sort the ArrayList with natural Order .sort(Comparator.naturalOrder()) the ArrayList
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        // Sort the ArrayList with Reverse Order .sort(Comparator.reverseOrder());
        groceries.sort(Comparator.reverseOrder());

        // convert the ArrayList into Array
        var convertIntoArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(convertIntoArray));

    }
}
