import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        reverse(new int[] {1,2,3,4,5});
    }

    private static void reverse(int[] array){


        System.out.println("Array = " + Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;

        while (left < right){

            // Swapping
            int swapTemp = array[left];
            array[left] = array[right];
            array[right] = swapTemp;



            left++;
            right--;

        }

        System.out.println("Reversed Array = " + Arrays.toString(array));
    }


}