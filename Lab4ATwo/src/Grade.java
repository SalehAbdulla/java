import java.util.*;

public class Grade {
    public static void main(String[] args) {
        //  0 - 59 = D, 60 - 69 = C, 70 - 84 = B, 85 – 100 = A.
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        if (grade >= 85 && grade <= 100) System.out.println("Your grade is A");
        else if (grade >= 70 && grade <= 84) System.out.println("Your grade is B");
        else if (grade >= 60 && grade <= 69) System.out.println("Your grade is C");
        else System.out.println("Your grade is D");



    }
}
