import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target){
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

//Example 1:
//
//Input: nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


//Example 2:
//Input: nums = [3, 2, 4], target = 6
//Output: [1, 2]
//Example 3:

//Input: nums = [3, 3], target = 6
//Output: [0,1]