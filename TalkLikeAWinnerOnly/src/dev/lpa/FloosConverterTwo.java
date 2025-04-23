package dev.lpa;

import java.util.*;
import java.text.DecimalFormat;

public class FloosConverterTwo {

    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat fmt = new DecimalFormat("#.##");

    public static void main(String[] args) {
        convert();
    }

    public static void convert() {
        System.out.println("BD to EUR converter");
        boolean stopLoop = false;

        do {
            System.out.println("Please enter amount (-99 to quit):");
            double userInput = scanner.nextDouble();

            if (userInput == -99) {
                stopLoop = true;
            } else {
                double calculation = convertTwoEuro(userInput);
                System.out.println(userInput + "BD is equal to" + fmt.format(calculation) + "Euros");
            }

        } while (!stopLoop);
    }

    //public static double convert2euro (double bd) method to complete the currency conversion
    //System.out.println("12.5 BHD is: "+convert2euro(12.5)+" Euros"); -> 12.5 BHD is: 23.125 Euros

    public static double convertTwoEuro(double priceInBD) {
        return priceInBD * 1.85;
    }


}
