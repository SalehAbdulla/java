import java.util.Scanner;

public class Lab3Q3Delimiter {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);


        System.out.println("Enter your full name: ");
        String fullName = scanner1.nextLine();
        Scanner scanner = new Scanner(fullName).useDelimiter(" ");

        System.out.printf("Your initials are: %c.%c.%n", scanner.next().charAt(0), scanner.next().charAt(0));
        System.out.println("Your family name is:" + fullName.substring(fullName.indexOf(" ")));
    }
}
