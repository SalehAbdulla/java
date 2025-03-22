import java.util.*;

public class Identity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Name: ");

        String name = scanner.nextLine();
        System.out.println("Your name in uppercase is: " + name.toUpperCase());
        System.out.println("Your name in lowercase is: " + name.toLowerCase());
        System.out.println("The length of your name is: " + name.length());

    }
}
