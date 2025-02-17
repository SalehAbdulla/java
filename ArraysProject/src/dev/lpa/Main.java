package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Fixed 10 element, we can't add or delete
        // we can only assign values to one of the ten elements
        // in this arrays
        int [] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        // save 50 to element 6.
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("First = " + firstTen[0]);

        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);

        // print last Array
        System.out.println("last = " + firstTen[arrayLength - 1]);

//        int[] newArray;
//        newArray = new int[] {5, 4, 3, 2, 1};

        int[] newArray = new int[5];

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i;
        }

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        for (int element : newArray){
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if (objectVariable instanceof int[]){
            System.out.println("objectVariable is an int[] array.");
        }
        // Array of any type
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = Arrays.toString(newArray);

        System.out.println();
        System.out.println(Arrays.toString(objectArray));

    }
}
