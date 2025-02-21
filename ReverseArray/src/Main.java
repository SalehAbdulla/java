import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        int[] reversedArray = reverseArray(array);
        System.out.println(Arrays.toString(reversedArray));

    }

    public static int[] reverseArray(int[] array){
        int[] copiedArray = Arrays.copyOf(array, array.length);

        int left = 0;
        int right = array.length - 1;

        while (left < right){

            int temp = copiedArray[left];
            copiedArray[left] = copiedArray[right];
            copiedArray[right] = temp;

            left++;
            right--;
        }

        return copiedArray;

    }
}