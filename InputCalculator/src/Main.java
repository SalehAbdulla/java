import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {
            try {
                int userInput = Integer.parseInt(scanner.nextLine());
                counter++;
                sum += userInput;
                avg = Math.round( (double) sum / counter);
            } catch (NumberFormatException e) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}