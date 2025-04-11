public class SolutionOne {

    public static int[] mergedArray(int[] array1, int[] array2) {

        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length){
            if (array1[i] < array2[j]){
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
            }
            k++;
        }

        while (i < array1.length){
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length){
            mergedArray[k] = array2[j];
            j++;
            k++;
        }
        return mergedArray;
    }

    public static double findMedian(int[] array){

        if (array.length % 2 == 1) {
            return array[array.length / 2];
        } else {
            return (double) (array[array.length / 2 - 1 ] + array[array.length / 2]) / 2;
        }

    }

}
