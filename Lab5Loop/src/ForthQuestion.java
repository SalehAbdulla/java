import java.util.Scanner;

public class ForthQuestion {

    public static String PASSWORD = "pwd123";
    public static boolean stopOuterLoop = false;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        do {
            System.out.println("Enter your password");
            String userPassInput = scanner.nextLine();
            if (userPassInput.equals(PASSWORD)) {
                stopOuterLoop = true;
                System.out.println("1. Choice 1\n" +
                        "2. Choice 2\n" +
                        "3. Choice 3\n" +
                        "4. Choice 4");
                int userChoiceInput = scanner.nextInt();

                switch (userChoiceInput) {
                    case 1:
                        System.out.println("You have entered choice 1");
                        break;
                    case 2:
                        System.out.println("You have entered choice 2");
                        break;
                    case 3:
                        System.out.println("You have entered choice 3");
                        break;
                    case 4:
                        System.out.println("You have entered choice 4");
                        break;
                    default:
                        System.out.println("You have entered an invalid choice");
                }

            } else {
                System.out.println("Invalid password");
            }
        } while (!stopOuterLoop);
    }
}
