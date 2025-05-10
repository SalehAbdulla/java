import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Lab3Q1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();
        System.out.println("Please enter your age:");
        int userAge = scanner.nextInt();
        System.out.println("Please enter your country of birth:");
        String userPlaceOfBirth = scanner.next();

        System.out.printf("Hi %s, you're %d and born in %s%n", userName, userAge, userPlaceOfBirth);

    }
}
