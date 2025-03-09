import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        DecimalFormat fmt = new DecimalFormat("#.00");

        double userInputRadius = scanner.nextDouble();

        // C = 2 Pi r
        double c = 2 * Math.PI * userInputRadius;

        System.out.println("The circumference of the circle is: " + fmt.format(c));

        double a = Math.PI * Math.pow(userInputRadius, 2);

        // A = PI * r ^ 2
        System.out.println("The area of the circle is: " + fmt.format(a));

    }
}