package dev.lpa;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = readIntegers();
        findMin(array);

    }

    public static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputToArray = input.split(",");
        System.out.println(Arrays.toString(inputToArray));

        int[] intArray = new int[inputToArray.length];

        for (int i = 0; i < inputToArray.length; i++){
            intArray[i] = Integer.parseInt(inputToArray[i].trim().replaceAll("\\s+", ""));
        }
        

        System.out.println(Arrays.toString(intArray));
        return intArray;

    }

    // Takes an array as an argument and returns the minimum value found in that array

    public static int findMin(int[] array){

        int assumeMinValue = array[0];

        for (int element : array){
            assumeMinValue = Math.min(assumeMinValue, element);
        }

        System.out.println("The Minimum Value in the array is = " + assumeMinValue);
        return assumeMinValue;
    }
}
