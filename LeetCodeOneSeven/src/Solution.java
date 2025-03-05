import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target){

//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]

        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            Integer complementIndex = complements.get(nums[i]);

            if (complementIndex != null){
                return new int[] {complementIndex, i};
            }

            complements.put(target - nums[i], i);

        }
        return nums;
    }
}
