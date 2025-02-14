public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] mergedNums = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums1[j]){
                mergedNums[k] = nums1[i];
                i++;
            } else {
                mergedNums[j] = nums2[k];
                j++;
            }
            k++;
        }
        
    }

}
