import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2, 3, 4, 5, 6, 10}, 5)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complement = complements.get(nums[i]);
            if (complement != null) {
                return new int[] {complement, i};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
}
