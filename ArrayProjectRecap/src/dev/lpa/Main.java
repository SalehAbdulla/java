package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myInt = new int[10];
        myInt[5] = 50;
        System.out.println(Arrays.toString(myInt));


        double[] myDouble = new double[10];
        myDouble[3] = 3.5;
        System.out.println(Arrays.toString(myDouble));
        System.out.println(myDouble[3]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);

        int firstTenArrayLength = firstTen.length;
        System.out.println(firstTenArrayLength);







    }
}