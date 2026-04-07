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
        int getUserChoice = mainMenu();

        switch (getUserChoice) {
            //TODO 1. Add Employee to the system
            case 1:
                addEmployeeToTheSystem();
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

        // Full time
        String name;
        String address;
        int phoneNumber;
        boolean isPhDHolder;
        boolean isMasterHolder;
        double annualSalary;

        // Part Time Additional requirements
        double monthlySalary;
        double hourlyRate;

        Employee newEmployee;

        switch (userChoice) {
            case 1:
                // TODO: CREATE ADMIN
                name = promptName();
                address = promptAddress();
                phoneNumber = promptPhoneNumber();
                isPhDHolder = promptIsPhDHolder();
                isMasterHolder = promptIsMasterHolder();
                annualSalary = promptAnnualSalary();
                newEmployee = new Admin(staffCounter++, name, address, phoneNumber, isPhDHolder, isMasterHolder, annualSalary);
                employees.add(newEmployee);
                break;
            case 2:
                // TODO: ADD FULL TIME TUTOR (SALARIED EMPLOYEE)
                name = promptName();
                address = promptAddress();
                phoneNumber = promptPhoneNumber();
                isPhDHolder = promptIsPhDHolder();
                isMasterHolder = promptIsMasterHolder();
                annualSalary = promptAnnualSalary();
                newEmployee = new SalariedTutor(staffCounter++, name, address, phoneNumber, isPhDHolder, isMasterHolder, annualSalary);
                employees.add(newEmployee);
                break;
            case 3:
                // TODO: ADD PART TIME TUTOR
                name = promptName();
                address = promptAddress();
                phoneNumber = promptPhoneNumber();
                isPhDHolder = promptIsPhDHolder();
                isMasterHolder = promptIsMasterHolder();
                monthlySalary = promptMonthlySalary();
                hourlyRate = promptHourlyRate();
                newEmployee = new PartTimeTutor(staffCounter++, name, address, phoneNumber, isPhDHolder, isMasterHolder, monthlySalary, hourlyRate);
                employees.add(newEmployee);
                break;
            default:
                System.out.println("invalid entry, addEmployeeToTheSystem()");
                exit(1);
        }
    }

    private String promptName() {
        String name = "";
        do {
            System.out.println("Enter employee name:");
            name = scanner.next().trim();
            if (name.isEmpty()) {
                System.out.println("Invalid entry: Name cannot be empty.");
            }
        } while (name.isEmpty());
        return name;
    }

    private String promptAddress() {
        String address = "";
        do {
            System.out.println("Enter employee address:");
            address = scanner.nextLine().trim();
            if (address.isEmpty()) {
                System.out.println("Invalid entry: Address cannot be empty.");
            }
        } while (address.isEmpty());
        return address;
    }

    private int promptPhoneNumber() {
        int phoneNumber = 0;
        boolean valid = false;
        do {
            System.out.println("Enter employee phone number:");
            try {
                phoneNumber = Integer.parseInt(scanner.next());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry: Phone number must be a valid number.");
            }
        } while (!valid);
        return phoneNumber;
    }

    private boolean promptIsPhDHolder() {
        String input = "";
        do {
            System.out.println("Is the employee a PhD holder? (yes/no):");
            input = scanner.next().trim().toLowerCase();
            if (!input.equals("yes") && !input.equals("no")) {
                System.out.println("Invalid entry: Please enter 'yes' or 'no'.");
            }
        } while (!input.equals("yes") && !input.equals("no"));
        return input.equals("yes");
    }

    private boolean promptIsMasterHolder() {
        String input = "";
        do {
            System.out.println("Is the employee a Master's holder? (yes/no):");
            input = scanner.next().trim().toLowerCase();
            if (!input.equals("yes") && !input.equals("no")) {
                System.out.println("Invalid entry: Please enter 'yes' or 'no'.");
            }
        } while (!input.equals("yes") && !input.equals("no"));
        return input.equals("yes");
    }

    private double promptAnnualSalary() {
        double annualSalary = 0;
        boolean valid = false;
        do {
            System.out.println("Enter employee annual salary:");
            try {
                annualSalary = Double.parseDouble(scanner.next());
                if (annualSalary <= 0) {
                    System.out.println("Invalid entry: Annual salary must be greater than 0.");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry: Annual salary must be a valid number.");
            }
        } while (!valid);
        return annualSalary;
    }

    private double promptMonthlySalary() {
        double monthlySalary = 0;
        boolean valid = false;
        do {
            System.out.println("Enter employee monthly salary:");
            try {
                monthlySalary = Double.parseDouble(scanner.next());
                if (monthlySalary <= 0) {
                    System.out.println("Invalid entry: Monthly salary must be greater than 0.");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry: Monthly salary must be a valid number.");
            }
        } while (!valid);
        return monthlySalary;
    }

    private double promptHourlyRate() {
        double hourlyRate = 0;
        boolean valid = false;
        do {
            System.out.println("Enter employee hourly rate:");
            try {
                hourlyRate = Double.parseDouble(scanner.next());
                if (hourlyRate <= 0) {
                    System.out.println("Invalid entry: Hourly rate must be greater than 0.");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry: Hourly rate must be a valid number.");
            }
        } while (!valid);
        return hourlyRate;
    }

    private int mainMenu(){
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