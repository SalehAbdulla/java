import java.util.*;

public class ISBN {
    public static void main(String[] args) {


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the ISBN in the following format x-xxxxx-xx-xx");
        String temp = scanner1.nextLine();
        Scanner scanner = new Scanner(temp).useDelimiter("-");

        int language = scanner.nextInt();
        int publisher = scanner.nextInt();
        int book = scanner.nextInt();
        int check = scanner.nextInt();

        System.out.printf("Language is: %d%n Publisher id: %d%n Book is: %d%n Check is: %d%n", language, publisher, book, check);

    }
}
