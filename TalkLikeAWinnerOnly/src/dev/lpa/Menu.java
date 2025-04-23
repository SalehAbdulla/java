package dev.lpa;

import java.security.PublicKey;
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
            String passUserInput = scanner.nextLine();
            if (passUserInput.equals(PASSWORD)) {
                System.out.println("Correct");

                do {
                    System.out.println("""
                            1. Choice 1
                            2. Choice 2
                            3. Choice 3
                            4. Exit""");

                    int userChoice = scanner.nextInt();

                    if (userChoice == 1) {
                        System.out.println("1. Choice 1");
                    } else if (userChoice == 2) {
                        System.out.println("2. Choice 2");
                    } else if (userChoice == 3) {
                        System.out.println("3. Choice 3");
                    } else {
                        System.out.println("Exit");
                        stopInnerLoop = true;
                    }

                } while (!stopInnerLoop);

                stopOuterLoop = true;
            } else {
                System.out.println("Invalid password");
            }
        } while (!stopOuterLoop);

    }
}
