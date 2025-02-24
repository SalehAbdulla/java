class Solution {

    //Example 1:
    //Input: nums1 = [1,3], nums2 = [2]
    //Output: 2.00000
    //Explanation: merged array = [1,2,3] and median is 2.

    public static double findTheMedianOfTwoArrays(int[] array1, int[] array2) {

        int[] mergedArray = new int[array1.length + array2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {

            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < array1.length) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        if (mergedArray.length % 2 == 1) {
            return mergedArray[mergedArray.length / 2];
        } else {
            return (double) ( mergedArray[mergedArray.length / 2] + mergedArray[mergedArray.length / 2] -1 ) / 2;
        }

    }
}