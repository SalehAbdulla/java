import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] mergeTwoArray = SolutionOne.mergedArray(new int[] {1, 2}, new int[] {3, 4});
        System.out.println(Arrays.toString(mergeTwoArray));
        System.out.println("Median of the array = " + SolutionOne.findMedian(mergeTwoArray));


    }
}