import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }


    public static int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
//            System.out.println("Element " + i + " contents " + array[i]);
        }

        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copiedArray);

        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < copiedArray.length - 1; i++) {
                if (copiedArray[i] < copiedArray[i + 1]) {
                    temp = copiedArray[i];
                    copiedArray[i] = copiedArray[i + 1];
                    copiedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return copiedArray;
    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++){
            System.out.println("Element "+ i + " contents " + array[i]);
        }

    }


}