import java.util.*;

public class Age {

    private static final int USER_AGE = 21;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");

        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);

        if (userInput < USER_AGE) {
            System.out.println("It's great to be young!");
        }

    }
}