package dev.lpa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
//        System.out.println(Arrays.toString(firstArray));

        // Sort array return void
        Arrays.sort(firstArray);
//        System.out.println(Arrays.toString(firstArray));

        // fill an array with specific digit
        int[] secondArray = new int[10];
        Arrays.fill(secondArray, 3);
//        System.out.println(Arrays.toString(secondArray));

        // copy array passing in (array, length)
        int[] fourthCopiedArray = Arrays.copyOf(secondArray, secondArray.length);
//        System.out.println(Arrays.toString(fourthCopiedArray));

        Arrays.sort(fourthCopiedArray);
//        System.out.println(Arrays.toString(fourthCopiedArray));

        int[] smallerArray = Arrays.copyOf(fourthCopiedArray, 4);
//        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(fourthCopiedArray, 15);
//        System.out.println(Arrays.toString(smallerArray));


        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        System.out.println(Arrays.toString(sArray));
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if (Arrays.binarySearch(sArray, "Mark") >= 0){
            System.out.println("Found Mark in the list");
            System.out.println(Arrays.binarySearch(sArray, "Mark"));
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }

    public static int[] getRandomArray(int randomLen){

        Random random = new Random();
        int[] newInt = new int[randomLen];

        for (int i = 0; i < newInt.length; i++){
            newInt[i] = random.nextInt(101);
        }

        return newInt;
    }

}
