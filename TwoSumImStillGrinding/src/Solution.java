import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[] {complementIndex, i};
            }

            complements.put(target - nums[i], i);
        }

        return nums;

    }
}
