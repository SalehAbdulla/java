import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int generateRandomNumber = (int) (Math.random() * 11);
        boolean endLoop = false;

        int counter = 1;
        System.out.println("Enter your guess between 1 - 10: ");
        Scanner scanner = new Scanner(System.in);
        int guessedNumber = scanner.nextInt();

        while (!endLoop) {
            if (guessedNumber == generateRandomNumber && counter == 1){
                System.out.println("Correct on first guess! 20 points");
                endLoop = true;
            } else if (guessedNumber == generateRandomNumber && counter == 2) {

            }
        }


    }
}
