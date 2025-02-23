import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = new int[] {1, 3, 5, 6, 7, 8, 9, 10};
        int[] nums2 = new int[] {2, 2, 3, 4, 5, 6};

        int[] solutionArray = Solution.findTheMedianOfTwoArray(nums1, nums2);
        System.out.println(Arrays.toString(solutionArray));

    }


}