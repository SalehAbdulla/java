package dev.lpa;


import java.security.Key;

public class MedianOfTwoSortedArrays {
    public static double medianOfTwoSortedArrays(int[] arrayOne, int[] arrayTwo) {

        int[] mergedArray = new int[arrayOne.length + arrayTwo.length];


        int i = 0, j = 0, k = 0;

        while (i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] < arrayTwo[j]) {
                mergedArray[k] = arrayOne[i];
                i++;
            } else {
                mergedArray[k] = arrayTwo[j];
            }
            k++;
        }

        while (i < arrayOne.length) {
            mergedArray[k] = arrayOne[i];
            i++;
            k++;
        }

        while (j < arrayTwo.length) {
            mergedArray[k] = arrayTwo[j];
            j++;
            k++;
        }

        if (mergedArray.length %2 == 1) {
            return mergedArray[mergedArray.length / 2];
        } else {
            return (double) (mergedArray[mergedArray.length / 2] + mergedArray[(mergedArray.length / 2) - 1]) / 2;
        }

    }
}
