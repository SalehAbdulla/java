import java.util.Scanner;

public class Lab3Q2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your fullname:");
        String userName = scanner.nextLine();

        System.out.println("Your name in uppercase is: " + userName.toUpperCase());
        System.out.println("Your name in lowercase is: " + userName.toLowerCase());
        System.out.println("The length of your name is: " + userName.length());

    }
}
