import java.util.Arrays;

class Main {

    public static void main(String[] args){
        Main mainInstance = new Main();
        System.out.println(Arrays.toString(mainInstance.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target){

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return nums;
    }
}