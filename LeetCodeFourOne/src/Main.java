import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayOne = new int[] {5, 6, 7, 8, 9};
        int[] arrayTwo = new int[] {3, 4, 5, 6, 7};

        int[] solution = Solution.mergeTwoArray(arrayOne, arrayTwo);
        System.out.println(Arrays.toString(solution));

        double median = Solution.findMedian(solution);
        System.out.println("The median = " + median);


        double medianUsingSolutionTwo = SolutionTwoUsingArrayList.findTheMedianOfTwoArrays(arrayOne, arrayTwo);
        System.out.println(medianUsingSolutionTwo);

    }
}