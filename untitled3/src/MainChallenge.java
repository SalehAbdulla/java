public class MainChallenge {
    public static void main(String[] args) {

        calcScore(true, 800, 5,100);
        calcScore(true, 1000, 8, 200);
    }

    public static void calcScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was" + finalScore);
        }
    }
}
