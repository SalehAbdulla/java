import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the ISBN in the following format x-xxx-xxxxx-x:");

        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        Scanner input = new Scanner(temp).useDelimiter("-");

        while (input.hasNext()){
            System.out.println(input.next());
        }

    }
}