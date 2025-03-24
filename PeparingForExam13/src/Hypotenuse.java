import java.text.DecimalFormat;

public class Hypotenuse {
    public static DecimalFormat fmt = new DecimalFormat("#0.00");

    public static void main(String[] args) {

        hypotenuse(5.5, 4.6);
        hypotenuse(5.5, 0);
    }

    public static void hypotenuse(double value1, double value2) {
        if (value1 <= 0 || value2 <= 0) {
            System.out.println("Invalid input");
        } else {
            double result = Math.sqrt(value1 * value1 + value2 * value2);
            System.out.println("Result is " + fmt.format(result));
        }
    }
}
