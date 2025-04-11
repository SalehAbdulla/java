import java.text.DecimalFormat;

public class Hypotenuse {

    public static DecimalFormat fmt = new DecimalFormat("#.00");

    public static void main(String[] args) {
        hypotenuse(5.5, 4.6);
    }

    public static void hypotenuse(double val1, double val2){

        if (val1 <= 0 || val2 <= 0){
            System.out.println("Invalid input");
        } else {
            double result = Math.sqrt(val1 * val1 + val2 * val2);
            System.out.println("Result is " + fmt.format(result));
        }


    }
}
