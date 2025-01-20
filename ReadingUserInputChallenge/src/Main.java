import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        int counter = 1;
        double sum = 0;

        while (counter <= 5){

            Scanner scanner = new Scanner(System.in);
            try {

                System.out.println("Enter number #" + counter + ": ");
                double userInput = Double.parseDouble(scanner.nextLine());
                sum += userInput;
                counter++;

            } catch (NumberFormatException e){
                System.out.println("Invalid Value");
            }
        }

        System.out.println("The sum of 5 numbers is = " + sum);
    }

}