package dev.lpa;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //Input: nums = [2,7,11,15], target = 9
        //Output: [0,1]
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i <= nums.length; i++) {

            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[] {complementIndex, i};
            }

            complements.put(target - nums[i], i);
                            // 9 - 2 => 1
                            // Does 7 in the HashMap?
                            // return its index, current i
        }
        return nums;
    }
}


//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]