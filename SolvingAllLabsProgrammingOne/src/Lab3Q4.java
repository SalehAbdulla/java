import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab3Q4 {
    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat fmt = new DecimalFormat("#.##");

    public static void main(String[] args) {
        System.out.println("Please enter the radius of the circle: ");
        double radiusUserInput = scanner.nextDouble();
        System.out.println("The circumference of the circle is: " + fmt.format(2 * Math.PI * radiusUserInput));
        System.out.println("The area of the circle is: " + fmt.format(Math.PI * Math.pow(radiusUserInput, 2)) );

    }
}

//Write a JAVA application (class name: Circle) that reads the radius of a circle and prints its area (A = π R2)
// and its circumference (2 π R). Display both results with only 2 decimal places (google this: use DecimalFormat to show 2 decimal places).
//Hint: use the pow() method and the PI attribute from the Math class (google this: pow() is java)
//Hint: use the DecimalFormat class from java.text.DecimalFormat
//
//For example:
//
//Input	Result
//1
//Please enter the radius of the circle:
//The circumference of the circle is: 6.28
//The area of the circle is: 3.14