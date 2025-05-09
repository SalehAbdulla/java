import java.awt.font.FontRenderContext;

public class QuestionEight {
    public static void main(String[] args) {
        int startValue = 7;
        int stopValue = 11;
        printOddNumber(startValue, stopValue);
    }

    // print the sequence of odd numbers
    public static void printOddNumber(int startValue, int stopValue) {
        for (int i = startValue; i <= stopValue; i++) {
            if (i % 2 == 1 || i %2 == -1) {
                System.out.println(i);
            }
        }
    }
}
