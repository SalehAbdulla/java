public class MainTwoChallenge {
    public static void main(String[] args) {

    }

    public void displayHighScorePosition(String name, int highScore) {
        return;
    }

    public int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
