package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] originalArray = {"First", "Second", "Third"};
        // Treated as an ArrayList, limitation no adding or removing
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "ONE");
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));
        System.out.println("-".repeat(30));

        originalList.sort(Comparator.reverseOrder());
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));

        System.out.println("-".repeat(30));

        // From List into ArrayList
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList.getClass().getName());

        System.out.println("-".repeat(30));

        ArrayList<String> stringList = new ArrayList<>(List.of("Jan", "Feb", "Mar"));

        // transfer ArrayList into Array
        String[] stringArray = stringList.toArray(new String[0]);

        System.out.println(Arrays.toString(stringArray));

    }
}
