import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your name");
        String name = scanner.nextLine();

        System.out.println("Please Enter your age");
        int age = scanner.nextInt();

        System.out.println("Please Enter your country of Birth: ");
        String country = scanner.next();


        System.out.printf("Hi %s, you're %d and born in %s", name, age, country);

    }
}