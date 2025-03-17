import java.util.*;

public class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your fullname: ");
        String name = scanner.nextLine();

        System.out.printf("Your initials are: %c.%c.%n", name.charAt(0), name.charAt(name.indexOf(" ") + 1));
        System.out.printf("Your family name is: %s", name.substring(name.indexOf(" ")));


    }
}
