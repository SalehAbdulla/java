import java.util.*;

public class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String userFullName = scanner.nextLine();

        System.out.printf("Your initials are: %c.%c.%n", userFullName.charAt(0), userFullName.charAt(userFullName.indexOf(" ") + 1));
        System.out.printf("Your family name is: %s%n", userFullName.substring(userFullName.indexOf(" ")));

    }
}
