import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your fullname:");

        String temp = scanner.nextLine();
        Scanner name = new Scanner(temp).useDelimiter(" ");

        String firstNameChar = name.next();
        String secondNameChar = name.next();

        System.out.println("Your initials are: "+ firstNameChar.charAt(0) + "." + secondNameChar.charAt(0) + ".");
        System.out.printf("Your family name is: %s", secondNameChar);

    }
}
