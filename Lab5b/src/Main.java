import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#.##");
        boolean quiteLoop = false;
        System.out.println("BD to EUR converter");

        do {

            System.out.println("Please enter amount (-99 to quit):");
            double userInput = scanner.nextDouble();

            if (userInput == -99) {
                quiteLoop = true;
            } else {
                System.out.println(fmt.format(userInput) + "BD is equal to " + fmt.format(userInput*1.85) + "Euros");
            }


        } while (!quiteLoop);

    }
}