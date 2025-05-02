import java.util.Scanner;
import java.text.DecimalFormat;

public class SecondQuestion {

    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat fmt = new DecimalFormat("#.##");

    public static void main(String[] args) {

    }

    //public static void convert() method to start the program
    public static void convert() {
        System.out.println("BD to EUR converter");
        do {
            System.out.println("Please enter amount (-99 to quit):");
            double userInput = scanner.nextDouble();
            if (userInput == -99) return;
            System.out.println("userInput" + " BD is equal to" + fmt.format(userInput * 1.85) + " Euros");
        } while (true);
    }

    //public static double convert2euro (double bd) method to complete the currency conversion
    public static double convert2euro(double bd) {
        return bd * 1.85;
    }


}
