import java.util.*;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your fullname:");
        String userInput = scanner.nextLine();

        char firstCharInFirstName = (char) userInput.charAt(0);
        char firstCharInLastName = (char) userInput.charAt(userInput.indexOf(" ") + 1);

        System.out.printf("Your initials are: %c.%c.%n", firstCharInFirstName, firstCharInLastName);

        String lastName = userInput.substring(userInput.indexOf(" "));
        System.out.println("Your family name is:" + lastName);

    }
}
