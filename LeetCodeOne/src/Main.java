import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Arrays.toString(main.twoSum(new int[] {2, 7, 11, 15}, 9)));
    }

    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    public int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null){
                return new int[]{complementIndex, i};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
}

