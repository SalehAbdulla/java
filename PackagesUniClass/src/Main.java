import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Name ");

        String userInput = scanner.nextLine(); // next will be only until the space.
        System.out.println("Hi " + userInput);

        System.out.println("Are you available now ?");

        boolean isAvailable = scanner.nextBoolean();
        System.out.println("Is available = " + isAvailable);

        System.out.println("Please enter your first character in your name:");
        char firstNameChar = scanner.next().charAt(0);
        System.out.println("The first character in your name is = " + firstNameChar);

        



    }
}