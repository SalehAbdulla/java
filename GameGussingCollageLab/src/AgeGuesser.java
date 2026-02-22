import java.util.Scanner;

public class AgeGuesser {
    private int number;

    public AgeGuesser(int number) {
        this.number = number;
    }

    public void StartTheGame(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please guess a number: ");
            int userInput = scanner.nextInt();
            if (userInput == number) {
                System.out.println("You guessed the number right!");
                break;
            } else if (userInput > number) {
                System.out.println("The number you inputted is high.");
            } else {
                System.out.println("The number you inputter is low.");
            }

        } while (true);
    }

}
