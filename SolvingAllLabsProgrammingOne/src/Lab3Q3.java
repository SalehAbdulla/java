import java.util.Scanner;

public class Lab3Q3 {
    public static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your fullname:");
        String fullName = scanner.nextLine();

        System.out.printf("Your initials are: %s.%s.%n", fullName.charAt(0), fullName.charAt(fullName.indexOf(" ") + 1));
        System.out.println("Your family name is:" + fullName.substring(fullName.indexOf(" ")));

    }
}
