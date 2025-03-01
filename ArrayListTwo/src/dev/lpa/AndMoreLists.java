package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class AndMoreLists {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(List.of("Saleh", "Abdulla"));
        arrayList.add("Saleh");
        arrayList.add("Abdulla");
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
    }

}
