import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> userList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("0 - shutdown,\n 1 - add item(s) to list (comma delimited list)\n 2- to remove any items\n " +
                "Enter a number for which action you would like to do: ");
        int userAction = scanner.nextInt();

        while (true) {
            if (userAction == 0) {
                System.out.println(userList);
                break;
            }
            if (userAction == 1){
                System.out.println("Enter the item to be added: ");
                String userInput = scanner.nextLine();
                userList.add(userInput);
                System.out.println(userList);
            }

            if (userAction == 2){
                System.out.println("Enter the item to be removed: ");
                String userInput = scanner.nextLine();
                userList.remove(userInput);
                System.out.println(userList);
            }
        }
    }

}