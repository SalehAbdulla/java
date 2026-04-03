import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

@NoArgsConstructor
@Data
public class EmployeeSalarySystem {
    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Employee> employees = new ArrayList<>();
    private long staffCounter = 1L;

    public void startApp(){
        int getUserChoice = promptUser();

        switch (getUserChoice) {
            //TODO 1. Add Employee to the system
            case 1:
//                addEmployeeToTheSystem();
                break;
            //TODO 2. Record monthly hours for part time tutor
            case 2:
//                recordMonthlyHoursForPartTimeTutor();
                break;
            //TODO 3. Print monthly salary report
            case 3:
//                printMonthlySalaryReport();
                break;
            //TODO 4. Print part time tutor monthly salary history
            case 4:
//                printPartTimeTutorMonthlySalaryHistory();
                break;
            //TODO 5. Exit
            default:
                exit(0);
        }
    }

    private void addEmployeeToTheSystem(){
        // TODO: Ask the user which kind of Employee would u like to add
        int userChoice = 0;
        do {
            System.out.println("which kind of employee would you like to add? insert (1 for Admin) (2 for Salaried Employee) (3 for Part Time Employee)");
           try {
               userChoice = Integer.parseInt(scanner.next());
           } catch (NumberFormatException e) {
               System.out.println("invalid entry: please insert (1 for Admin) (2 for Salaried Employee) (3 for Part Time Employee)");
               continue;
           }
           if (userChoice < 1 || userChoice > 3) {
               System.out.println("invalid entry: please insert (1 for Admin) (2 for Salaried Employee) (3 for Part Time Employee)");
               userChoice = 0;
           }
        } while (userChoice == 0);

        Employee newEmployee;

        switch (userChoice) {
            case 1:
                // TODO: CREATE ADMIN
                //(String name ,String address, int phoneNumber, boolean isPhDHolder, boolean isMasterHolder)

//                newEmployee = new Admin(staffCounter++, );

                // TODO: ADD ADMIN TO EMPLOYEES LIST

                break;
            case 2:
                // TODO: ADD FULL TIME TUTOR (SALARIED EMPLOYEE)
                break;
            case 3:
                // TODO: ADD PART TIME TUTOR
                break;
            default:
                System.out.println("invalid entry, addEmployeeToTheSystem()");
                exit(1);

        }



    }

    private int promptUser(){
        int userChoice = 0;

        do {

            System.out.println("""
                Please choose an option from the following menu:
                                    1. Add Employee to the system
                                    2. Record monthly hours for part time tutor
                                    3. Print monthly salary report
                                    4. Print part time tutor monthly salary history
                                    5. Exit
                """);

            try {
                userChoice = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("your choice must be a number between 1-5");
                continue;
            }

            if (userChoice == 5) {
                exit(0);
            }

            if (userChoice < 1 || userChoice > 5) {
                System.out.println("your choice must be a number between 1-5");
                userChoice = 0;
            }

        } while (userChoice == 0);

        return userChoice;
    }


}
