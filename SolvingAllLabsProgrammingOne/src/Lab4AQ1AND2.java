import java.util.Scanner;

public class Lab4AQ1AND2 {
    public static Scanner scanner = new Scanner(System.in);
    public static final int AGE = 21;
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        int userAge = scanner.nextInt();
        System.out.println("You entered: " + userAge);
        if (userAge < AGE) {
            System.out.println("It's great to be young");
        } else {
            System.out.println("Age is a state of mind!");
        }
    }
}
