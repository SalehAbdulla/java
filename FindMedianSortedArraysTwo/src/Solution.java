import java.util.Arrays;

public class Solution {
    //Input: nums1 = [1,3], nums2 = [2]
    //Output: 2.00000
    //Explanation: merged array = [1,2,3] and median is 2.

    public static int[] findTheMedianOfTwoArray(int[] nums1, int[] nums2){

        // Let's merge the two arrays -- must be sorted;

        int[] mergedArray = new int[nums1.length + nums2.length];

        int k = 0;

        for (int i = 0; i < nums1.length; i++){
            mergedArray[k++] = nums1[i];
        }

        for (int j = 0; j < nums2.length; j++){
            mergedArray[k++] = nums2[j];
        }

        Arrays.sort(mergedArray);


        // Find the median




        return mergedArray;
    }

}
