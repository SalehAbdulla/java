import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        printMenu();
        boolean isOn = true;
        ArrayList<String> grocery = new ArrayList<>();

        while (isOn) {
            switch (Integer.parseInt(scanner1.nextLine())) {
                case 0:
                    isOn = false;
                    break;

                case 1:
                    String temp = scanner1.nextLine();
                    Scanner scanner = new Scanner(temp).useDelimiter(",");
                    while (scanner.hasNext()){

                        if (grocery.contains(scanner.next())){
                            continue;
                        } else {
                            grocery.add(scanner.next());
                        }

                    }
                    grocery.sort(Comparator.naturalOrder());
                    System.out.println(grocery);
                    printMenu();
                break;

                case 2:
                    String temp2 = scanner1.nextLine();
                    Scanner scanner2 = new Scanner(temp2).useDelimiter(",");

                    while (scanner2.hasNext()){
                        grocery.remove(scanner2.next());
                    }
                    grocery.sort(Comparator.naturalOrder());

                    System.out.println(grocery);
                    printMenu();
                break;

                default:
                    System.out.println("Invalid Entry");
            }
        }
    }


    public static void printMenu() {

        String menu = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:""";

        System.out.println(menu);
    }


}