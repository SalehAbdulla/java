import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Input: nums = [2,7,11,15], target = 9
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            // if complement found in map, then return its index.
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null ){
                return new int[] {complementIndex, i};
            }
            // 9 - 2 = {7 : 0}
            complements.put(target - nums[i], i);
        }
        return nums;
    }
}
