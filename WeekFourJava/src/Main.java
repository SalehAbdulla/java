import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 - 10: ");
        int userInput = scanner.nextInt();
        String myName = scanner.nextLine();

        if (userInput == 7){
            System.out.println("Today's prize is yours 😎💕");
        }

        if (myName.equalsIgnoreCase("Saleh")){
            System.out.println("You name is " + myName);
        }

        if (myName.equals("saleh")){
            System.out.println("You name is " + myName);
        }

    }
}