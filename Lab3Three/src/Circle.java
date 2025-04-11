import java.util.*;
import java.text.DecimalFormat;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#0.00");

        System.out.println("Please enter the radius of the circle: ");

        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("The circumference of the circle is: " + fmt.format(circumference));
        System.out.println("The area of the circle is: " + fmt.format(area));


    }
}
