import java.util.Scanner;

public class FifthQuestion {
    public static final String PASSWORD = "pwd123";
    public static Scanner scanner = new Scanner(System.in);
    public static boolean stopInnerLoop = false;
    public static boolean stopOuterLoop = false;


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        do {
            System.out.println("Enter your password");
            String userPassInput = scanner.nextLine();
            if (userPassInput.equals(PASSWORD)) {
                stopOuterLoop = true;
                do {
                    System.out.println("1. Choice 1\n" +
                            "2. Choice 2\n" +
                            "3. Choice 3\n" +
                            "4. Exit");
                    int userChoiceInput = scanner.nextInt();
                    if (userChoiceInput == 4) {
                        stopInnerLoop = true;
                        break;
                    }
                    else if (userChoiceInput == 3) { System.out.println("You have entered choice 3"); }
                    else if (userChoiceInput == 2) { System.out.println("You have entered choice 2"); }
                    else if (userChoiceInput == 1) { System.out.println("You have entered choice 1"); }
                    else {System.out.println("You have entered an invalid choice"); }

                } while (!stopInnerLoop);

            } else {
                System.out.println("Invalid password");
            }

        } while (!stopOuterLoop);
    }

}


//Amend the code for Question 4.
// Change the menu so that option 4 is “Exit”.
// If the password is incorrect, the user should be repeatedly asked for the correct password. When password is correct,
// we want to repeatedly display the menu in the following cases:
//
//if the user enters 1-3
//if the user enters an invalid number.
//Choosing 4 in the menu will exit the program which means the program should end.
//
//Hint: Use 2 booleans, one for the first loop and one for the second loop.
//
//For example: