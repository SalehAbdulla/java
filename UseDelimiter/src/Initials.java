import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        System.out.println("Please enter your fullname:");

        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        Scanner input = new Scanner(temp).useDelimiter(" ");

        String firstName = input.next();
        String lastName = input.next();

        System.out.printf("Your initials are: %c.%c.%n", firstName.charAt(0), lastName.charAt(0));
        System.out.println("Your family name is: " + lastName);
    }
}
