import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = SortedArray.createAnArray();
        int[] sameArraySorted = SortedArray.sortArrayToDescentOrder(array);
        System.out.println(Arrays.toString(sameArraySorted));
    }
}