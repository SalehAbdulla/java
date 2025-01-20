public class MainChallenge {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 1000, 8, 200);
        System.out.println("The highScore is: " + highScore);


        System.out.println("The highScore is: " +
                calculateScore(true, 1000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}


