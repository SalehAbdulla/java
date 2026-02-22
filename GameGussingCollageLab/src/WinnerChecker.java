import java.util.Scanner;

public class WinnerChecker {
    private String[] winners;
    private Scanner scanner =  new Scanner(System.in);

    public WinnerChecker(String[] winners) {
        this.winners = winners;
    }


    private boolean isTeamWinner(String teamName) {
        boolean isExist = false;
        for (int i = 0; i < winners.length; i++) {
            if (teamName.equalsIgnoreCase(teamName.strip())) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    public void checkTeamResult(){
        System.out.println("Please enter the team name you would like to check: ");
        String teamName = scanner.nextLine();
        String result =  (isTeamWinner(teamName)) ? "This team won last 5 years" : "this team does not won";
        System.out.println(result);
    }

}
