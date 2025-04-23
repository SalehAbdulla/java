package dev.lpa;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arrayOne = new int[] {1, 3};
        int[] arrayTwo = new int[] {2};

        int mergedArrayMedian = findTheMedianOfTwoSortedArray(arrayOne, arrayTwo);
        System.out.println(mergedArrayMedian);

    }

    public static int findTheMedianOfTwoSortedArray(int[] arrayOne, int[] arrayTwo){
        int[] mergedArray = new int[arrayOne.length + arrayTwo.length];

        int i = 0, j = 0, k = 0;

        while (i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] < arrayTwo[j]) {
                mergedArray[k] = arrayOne[i];
                i++;
            } else {
                mergedArray[k] = arrayTwo[j];
                j++;
            }
            k++;
        }

        while (i < arrayOne.length){
            mergedArray[k] = arrayOne[i];
            i++;
            k++;
        }

        while (j < arrayTwo.length) {
            mergedArray[j] = arrayTwo[j];
            j++;
            k++;
        }

        // Find the median
        if (mergedArray.length %2 == 1){
            return mergedArray[mergedArray.length / 2];
        } else {
            return mergedArray[mergedArray.length / 2] + mergedArray[(mergedArray.length / 2 ) - 1] / 2;
        }

    }
}


//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.


//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

