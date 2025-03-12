import java.util.*;

public class AgeTwo {

    private static int USER_AGE = 21;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");

        int userAgeInput = scanner.nextInt();
        System.out.println("You entered: " + userAgeInput);

        if (userAgeInput < USER_AGE) {
            System.out.println("It's great to be young!");
        } else {
            System.out.println("Age is a state of mind!");
        }

    }
}