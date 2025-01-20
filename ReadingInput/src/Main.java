import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2025;
        //System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi "+ name + " Thank you");

        String dateOfBirth = System.console().readLine("What year were you born ?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "You are " + age + " year old";
    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Whats you name? ");
        String name = scanner.nextLine();
        System.out.println("Hi "+ name + " Thank you");

        int age = 0;

        boolean validDOB = false;

        do {
            System.out.println("Enter a year of birth >= 1897 and <= 2025");
            try{
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException e){
                System.out.println("Characters are not allowed");
            }
        } while (!validDOB);

        return "You are " + age + " year old";

    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear - dob);

    }
}