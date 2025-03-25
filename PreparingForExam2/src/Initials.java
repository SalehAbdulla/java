import java.util.*;

public class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();

        System.out.printf("Your initials are: %c.%c.%n", fullName.charAt(0), fullName.charAt(fullName.indexOf(" ") + 1));
        System.out.println("Your family name is: " + fullName.substring(fullName.indexOf(" ")));
    }
}
