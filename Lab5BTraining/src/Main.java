import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a single-digit number:");
        int divisor = scanner.nextInt();


        if (divisor < 1 || divisor > 9) {
            System.out.println("Please enter a valid single-digit number (1-9).");
        } else {
            System.out.println("Numbers divisible by " + divisor + " are:");

            for (int num = 0; num < numbers.length; num++) {
                if (numbers[num] % divisor == 0) {
                    System.out.print(numbers[num] + " ");
                }
            }
        }
        scanner.close();
    }
}