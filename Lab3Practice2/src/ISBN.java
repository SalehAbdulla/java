import java.util.*;

public class ISBN {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String temp = scanner1.nextLine();
        Scanner scanner = new Scanner(temp).useDelimiter("-");

        System.out.println("Please enter the ISBN in the following format x-xxx-xxxxx-x: ");

        int language = scanner.nextInt();
        int publisher = scanner.nextInt();
        int book = scanner.nextInt();
        int check = scanner.nextInt();

        System.out.println("Language is: " + language);
        System.out.println("Publisher is: " + publisher);
        System.out.println("Book is: " + book);
        System.out.println("Check is: " + check);
    }
}
