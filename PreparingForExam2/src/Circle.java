import java.util.*;
import java.text.DecimalFormat;


public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#.00");

        System.out.println("Please enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The circumference of the circle is: " + fmt.format(circumference));
        System.out.println("The area of the circle is: " + fmt.format(area));

    }
}
