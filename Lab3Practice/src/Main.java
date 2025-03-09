/*
Input: Philippe Pringuet

Please enter your fullname:
Your initials are: P.P.
Your family name is: Pringuet

* */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your fullname:");
        String userInput = scanner.nextLine();

        char firstCharInFirstName = (char) userInput.charAt(0);
        char lastCharInSecondName = (char) userInput.charAt(userInput.indexOf(" ") + 1);
        System.out.println(lastCharInSecondName);

        System.out.println(userInput.substring(userInput.indexOf(" ")));

    }
}