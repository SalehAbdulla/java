package dev.lpa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arrayTwoDimensional = new int[4][4];

        for (int[] outer : arrayTwoDimensional) {
            System.out.println(Arrays.toString(outer));
        }

        System.out.println("-".repeat(30));

        for (int i = 0; i < arrayTwoDimensional.length; i++) {
            for (int j = 0; j < arrayTwoDimensional.length; j++) {
                arrayTwoDimensional[i][j] = (i * 10) + (j + 1);
                System.out.println(Arrays.deepToString(arrayTwoDimensional));
            }

        }
//
//        System.out.println("-".repeat(30));
//
//        for (var outer : arrayTwoDimensional) {
//            for (var innerElement : outer) {
//                System.out.print(innerElement);
//            }
//            System.out.println();
//        }
//
//
//        System.out.println("-".repeat(30));
//

//
//        System.out.println("-".repeat(30));


    }


}
