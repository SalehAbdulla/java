import java.util.*;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String PASS = "C0RR3CT";
        final int LAST_DIGIT_OF_PHONE_NUMBER = 1234;

        System.out.println("Please enter password:");
        String userPassword = scanner.nextLine();

        if (userPassword.equals(PASS)){
            System.out.println("Please enter the last 4 digits of your phone number:");
            int userLastDigitPhoneNumber = scanner.nextInt();
            if (LAST_DIGIT_OF_PHONE_NUMBER == userLastDigitPhoneNumber){
                System.out.println("You have gained access to the system!");
            } else {
                System.out.println("Your phone number is incorrect!");
            }
        } else {
            System.out.println("Your password is incorrect!");
        }
    }
}
