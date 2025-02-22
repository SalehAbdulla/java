import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] newArray = findMedianSortedArrays(new int[] {1,2}, new int[] {4,5});
        System.out.println(Arrays.toString(newArray));

    }

    // Input: nums1 = [1,3], nums2 = [2]
    public static int[] findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length){

            if (nums1[i] < nums2[j]){
                mergedArray[k] = nums1[i];
                i++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
            }

            k++;
        }

        while (i < nums1.length){
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }


        while (j < nums2.length){
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }




        return mergedArray;

    }

}