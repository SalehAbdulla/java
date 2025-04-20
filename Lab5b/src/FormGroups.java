import java.util.Scanner;

public class FormGroups {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int total = formGroups();
//        System.out.println("User input is = " + total);

        int size = enterTeamSize();
//        System.out.println("User input is = " + size);

        calculateNbTeams(total, size);



    }
    public static int formGroups(){
        int result = 0;
        // Please comment your code appropriately

        while (true) {

            System.out.println("How many students are in the group?");
            //Please comment your code appropriately
            int userInput = input.nextInt();
            //Please comment your code appropriately

            if (userInput < 1) {
                System.out.println("Error: total number of students must be positive");
            } else {
                result = userInput;
                break;
            }

        }

        return result;
    }


    public static int enterTeamSize(){

        int result = 0;

        do {
            System.out.println("How many students should be in each team?");
            int userInput = input.nextInt();
            if (userInput >= 2 && userInput <= 5) {
                result = userInput;
                break;
            } else {
                System.out.println("Error: team size must be between 2 and 5");
            }

        } while (true);

        return result;
    }

    // Please comment your code appropriately

    public static void calculateNbTeams(int total, int size){
        //Please comment your code appropriately
        System.out.println("There will be " + (total / size) + " teams");
        //Please comment your code appropriately
        System.out.println("There will be " + (total % size)  + " students who have no team");
    }

}
