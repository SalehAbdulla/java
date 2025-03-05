package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] input = readIntegers();
        System.out.println(Arrays.toString(input));
        int minValue = findMin(input);
        System.out.println("The minimum number is = " + minValue);
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers separated by commas: ");

        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim().replaceAll("\\s+", ""));
        }

        return values;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int element : array){
            min = Math.min(min, element);
        }

        return min;
    }


}
