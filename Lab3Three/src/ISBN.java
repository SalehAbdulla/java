import java.util.*;

public class ISBN {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter the ISBN in the following format x-xxx-xxxxx-x:");
        String temp = scanner1.nextLine();
        Scanner scanner = new Scanner(temp).useDelimiter("-");

//        while (scanner.hasNext()){
//            System.out.println(scanner.next());
//        }

        String lang = scanner.next();
        String publisher = scanner.next();
        String book = scanner.next();
        String check = scanner.next();

        System.out.printf("Language is: %s\n" +
                "Publisher is: %s\n" +
                "Book is: %s\n" +
                "Check is: %s", lang, publisher, book, check);
    }
}
