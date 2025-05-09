

import java.util.Scanner;
import java.text.DecimalFormat;

public class QuestionOne {
    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat fmt = new DecimalFormat("#.##");

    public static void main(String[] args) {

        System.out.println("BD to EUR converter");

        while (true) {
            System.out.println("Please enter amount (-99 to quit):");
            double userInput = scanner.nextDouble();
            if (userInput == -99) break;
            System.out.println( userInput + "BD is equal to "+ fmt.format(userInput * 1.85) + "Euros");

        }

    }

}
