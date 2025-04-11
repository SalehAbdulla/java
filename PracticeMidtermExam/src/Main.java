import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please Enter the ISBN in the following format x-xxx-xxxxxx-x: ");
        String temp = scanner1.nextLine();
        Scanner scanner = new Scanner(temp).useDelimiter("-");

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