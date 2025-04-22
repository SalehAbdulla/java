package dev.lpa;

import java.util.Scanner;
import java.text.DecimalFormat;


public class FloosConverter {

    public static Scanner scanner = new Scanner(System.in);
    public static double userInput = 0.0;

    public static void main(String[] args) {
        bdToEuro();
    }

    public static void bdToEuro() {
        System.out.println("BD to EUR converter");
        boolean exit = false;
        DecimalFormat fmt = new DecimalFormat("#.##");

        do {

            System.out.println("Please enter amount (-99 to quit):");
            double userInput = scanner.nextDouble();

            if (userInput == -99) {
                exit = true;
            } else {
                System.out.println(userInput + "BD is equal to " + fmt.format(userInput * 1.85) + "Euros");
            }

        } while (!exit);
    }


}
