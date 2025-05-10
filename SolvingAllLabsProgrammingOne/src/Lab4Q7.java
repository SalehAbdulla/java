import java.util.Scanner;

public class Lab4Q7 {
    public static Scanner scanner = new Scanner(System.in);
    public static final String PASSWORD = "C0RR3CT";
    public static final int LAST_DIGITS = 1234;

    public static void main(String[] args) {
        System.out.println("Please enter password: ");

        String userInput = scanner.nextLine();

        if (userInput.equals(PASSWORD)) {
            System.out.println("Please enter the last 4 digits of your phone number: ");
            int userLastDigits = scanner.nextInt();

            if (userLastDigits == LAST_DIGITS) {
                System.out.println("You have gained access to the system!");
            }

        } else {
            System.out.println("Your password is incorrect!");
        }
    }

}
