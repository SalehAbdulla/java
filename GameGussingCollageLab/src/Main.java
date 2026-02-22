public class Main {
    public static void main(String[] args) {
        // Exercise 1
        AgeGuesser ageGuesser = new AgeGuesser(10);
        ageGuesser.StartTheGame();

        System.out.println("-".repeat(20));

        // Exercise 2
        int[] rainFallData = {30, 40, 45, 95, 130, 220, 210, 185, 135, 80, 40, 45};
        RainFallCalculator rainFallCalculator = new RainFallCalculator(rainFallData);
        double answer = rainFallCalculator.getAverage();
        System.out.printf("The mean of monthly rainfall for the year: %.2f\n", answer);

        System.out.println("-".repeat(20));

        // Exercise 3
        String[] teamsWonLastFiveYears = {"Manama", "Sitra", "Murharraq", "AlAhli", "Riffa"};
        WinnerChecker winnerChecker = new WinnerChecker(teamsWonLastFiveYears);
        winnerChecker.checkTeamResult();
    }
}
