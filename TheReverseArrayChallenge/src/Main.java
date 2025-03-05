import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        int[] reversedArray = reverse(array);
        System.out.println(Arrays.toString(reversedArray));
    }

    // {1, 2, 3, 4, 5}  --- > {5, 4, 3, 2, 1}

    public static int[] reverse(int[] array){
        int[] reverseArray = Arrays.copyOf(array, array.length);

        int left = 0;
        int right = reverseArray.length - 1;

        while (left < right){

            int temp = reverseArray[left];
            reverseArray[left] = reverseArray[right];
            reverseArray[right] = temp;

            left++;
            right--;

        }

        return reverseArray;
    }
}