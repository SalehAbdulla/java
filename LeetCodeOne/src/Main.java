import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        System.out.println(Arrays.toString(twoNums(new int[] {2,7,11,15}, 9)));
    }


    public static int[] twoNums(int[] nums, int target){

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