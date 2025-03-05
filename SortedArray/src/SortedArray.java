import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
// The objective of this exercise is to store some numbers entered by the user, and then sort them in descending order.

    public static int[] createAnArray(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0;  i < array.length; i++){
            array[i] = scanner.nextInt();
//            System.out.println("Element " + i + " contents " + array[i]);
        }

        return array;
    }

    public static int[] sortArrayToDescentOrder(int[] array){
        int[] copiedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copiedArray);

        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < copiedArray.length - 1; i++){
                if (copiedArray[i] < copiedArray[i + 1]){
                    temp = copiedArray[i];
                    copiedArray[i] = copiedArray[i + 1];
                    copiedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return copiedArray;
    }
}
