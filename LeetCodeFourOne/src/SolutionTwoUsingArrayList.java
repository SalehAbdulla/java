import java.util.*;

public class SolutionTwoUsingArrayList {
    public static double findTheMedianOfTwoArrays(int[] arrayOne, int[] arrayTwo) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arrayOne) {
            list.add(num);
        }

        for (int num : arrayTwo) {
            list.add(num);
        }

        list.sort(Comparator.naturalOrder());

        int[] mergedArray = new int[list.size()];

        int counter = 0;
        for (int element : list) {
            mergedArray[counter] = list.get(counter);
            counter++;
        }

        System.out.println(Arrays.toString(mergedArray));

        if (mergedArray.length % 2 == 1) {
            return mergedArray[mergedArray.length / 2];
        } else {
            return (double) (mergedArray[(mergedArray.length / 2) - 1] + mergedArray[mergedArray.length / 2] ) / 2;
        }

    }
}
