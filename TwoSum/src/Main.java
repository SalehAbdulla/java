import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        Main mainInstance = new Main();
        System.out.println(Arrays.toString(mainInstance.twoSum(new int[] {2,7,11,15},9)));
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null){
                return new int[]{i, complementIndex};
            }

            complements.put(target - nums[i], i);

        }
        return nums;
    }
}