public class Main {
    public static void main (String[]args) {
        boolean gameOver = true;
        int score = 5001;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your Score Was less than 5000, and greater than 1000");
        } else if (score > 5000) {
            System.out.println("Greater than 5000");
        } else {
            System.out.println("Got here");
        }
    }
}
