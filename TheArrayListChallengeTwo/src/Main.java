import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag){
            printProgram();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> removeItem(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void printProgram(){
        String printProgram = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""";
        System.out.print(printProgram + " ");
    }

    private static void addItems(ArrayList<String> groceries){
        System.out.println("Enter Items following by comma [,] ");
        String[] items = scanner.nextLine().split(",");

        for (String item : items){
            if (groceries.indexOf(item) < 0){
                groceries.add(item.trim());
            }
        }
    }

    private static void removeItem(ArrayList<String> groceries){
        System.out.println("Enter Items following by comma [,] ");
        String[] items = scanner.nextLine().split(",");

        for (String item: items){
            if (groceries.indexOf(item) > 0){
                groceries.remove(item.trim());
            }
        }

    }

}