public class PositiveNegative {
    public static void main(String[] args) {
        numberState(0);
        numberState(-1);
        numberState(333);
        numberState(-4);
    }

    public static void numberState(int num) {
        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}

