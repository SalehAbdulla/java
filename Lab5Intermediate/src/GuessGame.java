import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int generateRandomNumber = (int) (Math.random() * 11);
        System.out.println(generateRandomNumber);
        boolean endLoop = false;

        int counter = 0;
        Scanner scanner = new Scanner(System.in);


        while (!endLoop) {
            System.out.println("Enter your guess between 1 - 10: ");
            int guessedNumber = scanner.nextInt();
            counter++;

            if (guessedNumber == generateRandomNumber && counter == 1) {
                System.out.println("Correct on first guess! 20 points");
                endLoop = true;
            } else if (guessedNumber == generateRandomNumber && counter == 2) {
                System.out.println("Correct on second guess! 10 points");
                endLoop = true;
            } else if (guessedNumber == generateRandomNumber && counter == 3) {
                System.out.println("Correct on third guess! 5 points");
                endLoop = true;
            } else if (guessedNumber == generateRandomNumber && counter > 3){
                System.out.println("Correct.");
                endLoop = true;
            }

        }


    }
}
