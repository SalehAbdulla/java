import java.util.Scanner;

public class QuestionFour {
    public static Scanner scanner = new Scanner(System.in);

    public static final String PASSWORD = "pwd123";
    public static boolean stopOuterLoop = false;
    public static boolean stopInnerLoop = false;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        do {
            System.out.println("Enter your password");
            String userPasswordEntry = scanner.nextLine();
            if (userPasswordEntry.equals(PASSWORD)) {
                stopOuterLoop = true;
                System.out.println("1. Choice 1\n" + "2. Choice 2\n" + "3. Choice 3\n" + "4. Choice 4");
                int userChoiceEntry = scanner.nextInt();
                if (userChoiceEntry > 0 && userChoiceEntry < 5) {
                    System.out.println("You have entered choice " + userChoiceEntry);
                } else {
                    System.out.println("You have entered an invalid choice");
                }

            } else {
                System.out.println("Invalid password");
            }

        } while (!stopOuterLoop);

    }
}
