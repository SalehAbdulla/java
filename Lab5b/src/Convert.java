import java.text.DecimalFormat;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        //  12.5 BHD is: 23.125 Euros
        System.out.println("12.5 BHD is: "+convert2euro(12.5)+" Euros");

    }


    // This method starts the program and provides the menu
    public static void convert() {
        Scanner scanner = new Scanner(System.in);
        //DecimalFormat fmt = new DecimalFormat("#.##");
        boolean quiteLoop = false;
        System.out.println("BD to EUR converter");

        do {

            System.out.println("Please enter amount (-99 to quit):");
            double userInput = scanner.nextDouble();

            if (userInput == -99) {
                quiteLoop = true;
            }

        } while (!quiteLoop);

    }

    // This method is used to complete the currency conversion
    public static double convert2euro(double bd) {
        return bd*1.85;
    }
}
