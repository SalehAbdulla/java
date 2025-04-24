package dev.lpa;

import java.util.Scanner;

public class MenuTwo {

    public static final String PASSWORD = "pwd123";

    public static Scanner scanner = new Scanner(System.in);
    public static boolean stopOuterLoop = false;
    public static boolean stopInnerLoop = false;


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        do {
            System.out.println("Enter your password");
            String userPassEntry = scanner.nextLine();
            if (userPassEntry.equals(PASSWORD)) {
                stopOuterLoop = true;

                do {
                    System.out.println("""
                            1. Choice 1
                            2. Choice 2
                            3. Choice 3
                            4. Exit""");

                    int userChoiceEntry = scanner.nextInt();
                    if (userChoiceEntry == 1) {System.out.println("You have entered choice 1");}
                    else if (userChoiceEntry == 2) {System.out.println("You have entered choice 2");}
                    else if (userChoiceEntry == 3) {System.out.println("You have entered choice 3");}
                    else if (userChoiceEntry == 4) {
                        stopInnerLoop = true;
                    } else {
                        System.out.println("You have entered an invalid choice");
                    }

                } while (!stopInnerLoop);

            } else {
                System.out.println("Invalid password");
            }

        } while (!stopInnerLoop);


    }
}
