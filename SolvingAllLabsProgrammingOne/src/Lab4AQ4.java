import java.util.Scanner;

public class Lab4AQ4 {
    public static Scanner scanner = new Scanner(System.in);
    public static String PASSWORD = "C0RR3CT";

    public static void main(String[] args) {
        System.out.println("Please enter password: ");
        String userPasswordInput = scanner.nextLine();
        if (userPasswordInput.equals(PASSWORD)) {
            System.out.println("You have gained access to the system!");
        } else {
            System.out.println("Your password is incorrect!");
        }
    }
}
