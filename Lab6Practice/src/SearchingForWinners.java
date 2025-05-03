import java.util.Scanner;

public class SearchingForWinners {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean flag = false;

    public static void main(String[] args) {

        String[] winners = {"Manama", "Sitra", "Muharraq", "AlAhli", "Riffa"};
        System.out.println("Please enter a team name");
        String userInput = scanner.nextLine();

        for (int i = 0; i < winners.length; i++) {
            if (winners[i].equals(userInput)) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println( userInput + " has won the league in the last 5 years");
        } else {
            System.out.println( userInput + " has NOT won the league in the last 5 years");
        }
    }
}
