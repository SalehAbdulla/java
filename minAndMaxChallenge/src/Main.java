import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tracking the maximum and minimum userInput application
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true){
            int userInput;
            try {
                System.out.println("Track max & min input, Enter a character to exit");
                userInput = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                break;
            }
            if (userInput < min){
                min = userInput;
            }

            if (userInput > max) {
                max = userInput;
            }
        }
        System.out.println("The maximum value is = " + max);
        System.out.println("The minimum value is = " + min);

    }
}