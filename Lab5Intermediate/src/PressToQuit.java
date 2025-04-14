import java.util.Scanner;

public class PressToQuit {

    public static Scanner scanner = new Scanner(System.in);
    public static char userInput;

    public static void main(String[] args) {

        userInput = getUserInput();

        while (userInput != 'q') {

            System.out.println("Please press any key, or press q to quit");
            System.out.printf("You pressed the %c key\n", userInput);
            userInput = getUserInput();


        }
        System.out.println("Please press any key, or press q to quit");
        System.out.println("You pressed the q key");
        scanner.close();
    }

    public static char getUserInput() {

        char userInput = Character.toLowerCase(scanner.next().charAt(0));
        return userInput;
    }
}