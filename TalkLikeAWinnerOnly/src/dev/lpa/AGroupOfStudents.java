package dev.lpa;

import java.net.SocketOption;
import java.util.Scanner;

public class AGroupOfStudents {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int total = formGroups();
        int size = enterTeamSize();
        calculateNbTeams(total, size);
    }


    //formGroups, which will prompt the user and return the total number of students (must include input validation)
    //enterTeamSize, which will prompt the user and return the team size (must include input validation)
    //calculateNbTeams, which takes the number of students and team size as parameters and prints the output message as per the example

    public static int formGroups() {

        boolean stopLoop = false;
        int result = 0;

        do {
            System.out.println("How many students are in the group?");
            int userInput = scanner.nextInt();

            if (userInput <= 0) {
                System.out.println("Error: total number of students must be positive");
            } else {
                stopLoop = true;
                result += userInput;
            }

        } while (!stopLoop);

        return result;

    }

    public static int enterTeamSize() {

        boolean stopLoop = false;
        int result = 0;

        do {

            System.out.println("How many students should be in each team?");
            int userInput = scanner.nextInt();

            if (userInput < 2 || userInput > 5) {
                System.out.println("Error: team size must be between 2 and 5");
            } else {
                result += userInput;
                stopLoop = true;
            }


        } while (!stopLoop);

        return result;
    }

    public static void calculateNbTeams(int total, int size) {
        System.out.println("There will be " + total / size + " teams");
        System.out.println("There will be " + total % size + " students who have no team");
    }

}
