import java.util.*;

public class InitialsTwo {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        String temp = scanner1.nextLine();
        Scanner scanner = new Scanner(temp).useDelimiter(" ");

        System.out.println("Please enter your fullname:");
        String firstname = scanner.next();
        String lastname = scanner.next();

        System.out.printf("Your initials are: %c.%c.%n", firstname.charAt(0), lastname.charAt(0));
        System.out.println("Your family name is: " + lastname);

    }
}
