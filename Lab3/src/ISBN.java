import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        System.out.println("Please enter the ISBN in the following format x-xxx-xxxxx-x:");

        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        Scanner name = new Scanner(temp).useDelimiter("-");

        int language  = name.nextInt();
        int publisher = name.nextInt();

        int bookIs  = name.nextInt();
        int checkIs = name.nextInt();

        System.out.printf("Language is: %d%n", language);
        System.out.printf("Publisher is: %d%n", publisher);

        System.out.printf("Book is: %d%n", bookIs);
        System.out.printf("Check is: %d%n", checkIs);

    }
}
