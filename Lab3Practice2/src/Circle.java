import java.util.*;
import java.text.DecimalFormat;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");


        DecimalFormat fmt = new DecimalFormat("#.00");
        double radius = scanner.nextDouble();
        System.out.println("The circumference of the circle is: " + fmt.format(2 * Math.PI * radius));
        System.out.println("The area of the circle is: " + fmt.format(Math.PI * Math.pow(radius, 2)));
    }
}
