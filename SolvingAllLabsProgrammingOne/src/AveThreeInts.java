import java.text.DecimalFormat;

public class AveThreeInts {
    public static DecimalFormat fmt = new DecimalFormat("#.####");
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 7;
        int number3 = 2;
        double avg = (double) (number1 + number2 + number3) / 3;
        System.out.println("values of three integers are: 5 7 2 and the average is: " + fmt.format(avg));
    }
}
