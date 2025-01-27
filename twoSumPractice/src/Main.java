import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// Return indices of the two numbers such that they add up to target. [3,2,4] 6  -> [1, 2]
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Arrays.toString(main.twoSum(new int[]{3, 2, 4}, 6)));
    }

    public int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> complements = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
           Integer complementIndex = complements.get(nums[i]);
           if (complementIndex != null){
               return new int[]{complementIndex, i};
           }
           complements.put(target - nums[i], i);
        }

        return nums;
    }

}