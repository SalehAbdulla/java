package dev.lpa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        modifyArray(myIntArray);

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){

        array[1] = 2;

    }
}
