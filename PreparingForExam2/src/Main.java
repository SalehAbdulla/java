import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name:");
        String userInput = scanner.nextLine();

        System.out.println(userInput.toUpperCase());
        System.out.println(userInput.toLowerCase());
        System.out.println(userInput.length());
    }
}