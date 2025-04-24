package dev.lpa;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FloosConverter {

    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat fmt = new DecimalFormat("#.##");

    public static void main(String[] args) {
        System.out.println("BD to EUR converter");

        do {
            System.out.println("Please enter amount (-99 to quit):");
            double userInput = scanner.nextDouble();
            if (userInput == -99) {break;}
            System.out.println( fmt.format(userInput) + "BD is equal to " +  fmt.format(userInput*1.85) + "Euros");


        } while (true);

    }

}


//Input	Result
//1.5
//        -99
//BD to EUR converter
//Please enter amount (-99 to quit):
//        1.5BD is equal to 2.78Euros
//Please enter amount (-99 to quit):
