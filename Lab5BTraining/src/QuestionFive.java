import java.util.Scanner;

public class QuestionFive {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean stopOuterLoop = false;
    public static String PASSWORD = "pwd123";
    public static boolean stopInnerLoop = false;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("Enter your password");
        do {
            String userInput = scanner.nextLine();
            if (userInput.equals(PASSWORD)) {
                stopOuterLoop = true;
                do {
                    System.out.println("1. Choice 1");
                    System.out.println("2. Choice 2");
                    System.out.println("3. Choice 3");
                    System.out.println("4. Exit");

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
                            stopInnerLoop = true;
                            break;
                        default:
                            System.out.println("You have entered an invalid choice");
                    }
                } while (!stopInnerLoop);

            } else {
                System.out.println("Invalid password");
            }

        } while(!stopOuterLoop);

    }
}
