import java.util.*;

public class InitialsTwo {
    public static void main (String[] args) {


        System.out.println("Please enter your fullname: ");

        Scanner scanner1 = new Scanner(System.in);
        String temp = scanner1.nextLine();
        Scanner scanner = new Scanner(temp).useDelimiter(" ");

        String firstName = scanner.next();
        String lastName = scanner.next();

        System.out.printf("Your initials are: %c.%c.%n", firstName.charAt(0), lastName.charAt(0));
        System.out.println("Your family name is: " + lastName);

    }
}
