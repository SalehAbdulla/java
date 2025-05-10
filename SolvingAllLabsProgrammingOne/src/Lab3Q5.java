import java.util.Scanner;

public class Lab3Q5 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the ISBN in the following format x-xxx-xxxxx-x:");

        String temp = scanner1.nextLine();
        Scanner scanner = new Scanner(temp).useDelimiter("-");
        System.out.println("Language is: " + scanner.next());
        System.out.println("Publisher is: " + scanner.next());
        System.out.println("Book is: " + scanner.next());
        System.out.println("Check is: " + scanner.next());
    }
}
