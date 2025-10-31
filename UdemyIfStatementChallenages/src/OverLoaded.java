public class OverLoaded {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        int newScore2 = calculateScore(500);
        int newScore3 = calculateScore();
        System.out.println(newScore);
        System.out.println(newScore2);
        System.out.println(newScore3);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Unknown", score);
    }

    public static int calculateScore() {
        System.out.println("No Player " + "No score");
        return 0;
    }

}
