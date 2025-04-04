public class Solution {
    public static int[] mergeTwoArray(int[] arrayOne, int[] arrayTwo) {

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

        return mergedArray;

    }


    public static double findMedian(int[] array) {
        if (array.length % 2 == 1) {
            return array[array.length / 2];
        } else {
            return (double) (array[(array.length / 2) - 1] + array[(array.length / 2)] ) / 2;
        }
    }

}
