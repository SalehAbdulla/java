import java.util.Scanner;

public class SimpleApp {
    public static void main(String[] args) {
        menu();
    }
    public static final String PASS = "pwd123";
    public static Scanner scanner  = new Scanner(System.in);

    public static void menu(){
        boolean exit = false;

        do {
            System.out.println("Enter your password");
            if (scanner.nextLine().equals(PASS)) {


                System.out.println("1. Choice 1");
                System.out.println("2. Choice 2");
                System.out.println("3. Choice 3");
                System.out.println("4. Choice 4");


                while (!exit){
                    int userInput = scanner.nextInt();

                    switch (userInput){
                        case 1:
                            System.out.println("You have entered choice " + 1);
                            exit = true;
                            break;
                        case 2:
                            System.out.println("You have entered choice " + 2);
                            exit = true;
                            break;
                        case 3:
                            System.out.println("You have entered choice " + 3);
                            exit = true;
                            break;
                        case 4:
                            System.out.println("You have entered choice " + 4);
                            exit = true;
                            break;
                        default:
                            System.out.println("You have entered an invalid choice");
                            exit = true;
                            break;
                    }
                }
                break;
            } else {
                System.out.println("Invalid password");
            }

        } while (true);

    }
}

