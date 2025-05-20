package dev.lpa;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(medianOfTwoSortedArray(nums1, nums2));

    }

    public static double medianOfTwoSortedArray(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
            } else {
                mergedArray[k] = nums1[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }

        if (mergedArray.length %2 == 1) {
            return mergedArray[mergedArray.length / 2];
        } else {
            return (double) (mergedArray[mergedArray.length / 2] + mergedArray[mergedArray.length / 2] + 1) / 2 ;
        }
    }
}
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
