import java.util.Scanner;

public class Lab4Q6 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your exam mark");
        double grade = scanner.nextDouble();
        if (grade >= 85 && grade <= 100) {
            System.out.println("Your grade is A");
        } else if (grade >= 70 && grade <= 84) {
            System.out.println("Your grade is B");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is D");
        }
    }
}
