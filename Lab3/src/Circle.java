import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");

        double userInput = scanner.nextDouble();

        // area (A = π R2)
        double area = Math.PI * Math.pow(userInput, 2);
        // circumference (2 π R).
        double circumference = 2 * Math.PI * userInput;

        DecimalFormat fmt = new DecimalFormat("#.00");

        System.out.println("The circumference of the circle is: " + fmt.format(circumference));
        System.out.println("The area of the circle is: " + fmt.format(area));


    }
}
