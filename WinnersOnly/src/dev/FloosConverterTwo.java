package dev;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FloosConverterTwo {

    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat fmt = new DecimalFormat("#.##");

    public static void main(String[] args) {
        convert();
        System.out.println("12.5 BHD is: "+convert2euro(12.5)+" Euros");

    }

    public static void convert() {
        System.out.println("BD to EUR converter");
        do {
            System.out.println("Please enter amount (-99 to quit):");
            double userInput = scanner.nextDouble();
            if (userInput == -99)  break;

            System.out.println(fmt.format(userInput) + "BD is equal to " +
                    fmt.format(userInput * 1.85) +" Euros");

        } while (true);
    }

    public static double convert2euro(double amount){
        return amount * 1.85;
    }
}
