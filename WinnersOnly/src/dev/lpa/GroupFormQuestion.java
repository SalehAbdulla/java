package dev.lpa;

import java.util.Scanner;
import java.text.DecimalFormat;

public class GroupFormQuestion {

    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat fmt = new DecimalFormat("#.##");

    public static void main(String[] args) {
        int total = formGroups();
        int size = enterTeamSize();
        calculateNbTeams(total, size);
    }

    //formGroups,
    // which will prompt the user and return the total number of students (must include input validation)

    public static int formGroups() {
        do {
            System.out.println("How many students are in the group?");
            int userInput = scanner.nextInt();
            if (userInput <= 0) System.out.println("Error: total number of students must be positive");
            if (userInput > 0) return userInput;
        } while (true);
    }

    public static int enterTeamSize() {
        do {
            System.out.println("How many students should be in each team?");
            int userInput = scanner.nextInt();
            if (userInput < 2 || userInput > 5) {
                System.out.println("Error: team size must be between 2 and 5");
            } else {
                return userInput;
            }
        }
        while (true);
    }

    public static void calculateNbTeams(int total, int size) {
        System.out.println("There will be " + total / size + " teams");
        System.out.println("There will be " + total % size + " students who have no team");
    }
}
