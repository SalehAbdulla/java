import java.util.Arrays;

public class Solution {
    //Input: nums1 = [1,3], nums2 = [2]
    //Output: 2.00000
    //Explanation: merged array = [1,2,3] and median is 2.

    public static int[] findTheMedianOfTwoArray(int[] nums1, int[] nums2){

        // Let's merge the two arrays -- must be sorted;

        int[] mergedArray = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){

            }
        }


        // Find the median




        return mergedArray;
    }

}
