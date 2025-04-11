import java.util.Scanner;

public class Identity {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your fullname:");

        String username = scanner.nextLine();


        System.out.printf("Your name in uppercase is: %s%n", username.toUpperCase());
        System.out.printf("Your name in lowercase is: %s%n", username.toLowerCase());
        System.out.printf("The length of your name is: %d%n", username.length());

    }
}
