import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();

        System.out.println("Please enter your age:");
        int userAge = scanner.nextInt();

        System.out.println("Please enter your country of birth:");
        String userBirthLocation = scanner.next();

        System.out.printf("Hi %s, you're %d and born in %s", userName, userAge, userBirthLocation);

    }
}