public class EighthQuestions {
    public static void main(String[] args) {
        printOddNumber(7, 11);
    }

    public static void printOddNumber(int startValue, int endValue) {
        for (int i = startValue; i <= endValue; i++) {
            if (i %2 == 1) {
                System.out.println(i);
            }
        }

    }
}
