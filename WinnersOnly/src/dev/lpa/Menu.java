package dev.lpa;

import java.util.Scanner;

public class Menu {

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
            String userInput = scanner.nextLine();
            if (userInput.equals(PASSWORD)) {
                stopOuterLoop = true;
                do {

                    System.out.println("""
                            1. Choice 1
                            2. Choice 2
                            3. Choice 3
                            4. Choice 4""");

                    int userChoice = scanner.nextInt();

                    if (userChoice == 1) {
                        System.out.println("You have entered choice 1");
                        stopInnerLoop = true;
                    } else if (userChoice == 2) {
                        System.out.println("You have entered choice 2");
                        stopInnerLoop = true;
                    } else if (userChoice == 3) {
                        System.out.println("You have entered choice 3");
                        stopInnerLoop = true;
                    } else if (userChoice == 4) {
                        System.out.println("You have entered choice 4");
                        stopInnerLoop = true;
                    } else {
                        System.out.println("You have entered an invalid choice");
                    }
                } while (!stopInnerLoop);
            }
        } while (!stopOuterLoop);
    }
}
