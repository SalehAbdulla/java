import java.util.*;

public class ISBN {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the ISBN in the following format x-xxx-xxxxx-x:");
        String temp = scanner1.nextLine();
        Scanner scanner = new Scanner(temp).useDelimiter("-");

        int lang = scanner.nextInt();
        int publisher = scanner.nextInt();
        int book = scanner.nextInt();
        int check = scanner.nextInt();

        System.out.printf("Language is: %d%n" +
                "Publisher is: %d%n" +
                "Book is: %d%n" +
                "Check is: %d%n", lang, publisher, book, check);
    }
}
