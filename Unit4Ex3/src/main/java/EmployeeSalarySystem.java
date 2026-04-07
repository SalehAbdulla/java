import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

@NoArgsConstructor
@Data
public class EmployeeSalarySystem {
    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Employee> employees = new ArrayList<>();
    private long staffCounter = 1L;

    public void startApp() {
        while (true) {
            int getUserChoice = mainMenu();
            switch (getUserChoice) {
                case 1 -> addEmployeeToTheSystem();
                case 2 -> recordMonthlyHoursForPartTimeTutor();
                case 3 -> printMonthlySalaryReport();
                case 4 -> printPartTimeTutorMonthlySalaryHistory();
                default -> exit(0);
            }
        }
    }

    private void printPartTimeTutorMonthlySalaryHistory() {
        long employeeId = promptEmployeeId();

        Employee foundEmployee = null;
        for (Employee employee : employees) {
            if (employee.getStaffId() == employeeId) {
                foundEmployee = employee;
                break;
            }
        }

        if (foundEmployee == null) {
            System.out.println("No employee found with ID: " + employeeId);
            return;
        }

        if (!(foundEmployee instanceof PartTimeTutor partTimeTutor)) {
            System.out.println("Employee with ID " + employeeId + " is not a Part Time Tutor.");
            return;
        }

        System.out.println("========== Part Time Tutor Salary History ==========");
        System.out.println("ID:   " + partTimeTutor.getStaffId());
        System.out.println("Name: " + partTimeTutor.getName());

        if (partTimeTutor.getNumberOfHoursList().isEmpty()) {
            System.out.println("No monthly records found for this tutor.");
            return;
        }

        for (PartTimeRecord record : partTimeTutor.getNumberOfHoursList()) {
            double monthlySalary = partTimeTutor.getHourlyRate()
                    * record.getNumberOfHoursWorkedAMonth();

            System.out.println("---------------------------------------------------");
            System.out.println("Year:           " + record.getYear());
            System.out.println("Month:          " + record.getMonth());
            System.out.printf ("Hours Worked:   %.2f%n", record.getNumberOfHoursWorkedAMonth());
            System.out.printf ("Monthly Salary: %.2f%n", monthlySalary);
        }

        System.out.println("====================================================");
    }

    private void printMonthlySalaryReport() {
        if (employees.isEmpty()) {
            System.out.println("No employees found in the system.");
            return;
        }

        System.out.println("========== Monthly Salary Report ==========");

        for (Employee employee : employees) {
            double monthlySalary = calculateMonthlySalary(employee);

            System.out.println("-------------------------------------------");
            System.out.println("ID:             " + employee.getStaffId());
            System.out.println("Name:           " + employee.getName());
            System.out.println("Address:        " + employee.getAddress());
            System.out.println("Phone:          " + employee.getPhoneNumber());
            System.out.printf ("Monthly Salary: %.2f%n", monthlySalary);
        }

        System.out.println("===========================================");
    }

    private double calculateMonthlySalary(Employee employee) {
        if (employee instanceof Admin admin) {
            return admin.calcMonthlySalary();
        } else if (employee instanceof SalariedTutor salariedTutor) {
            return salariedTutor.calcMonthlySalary();
        } else if (employee instanceof PartTimeTutor partTimeTutor) {
            return partTimeTutor.calcMonthlySalary();
        } else {
            return 0;
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
        // Admin requirements
        boolean hasAdditionalDuty;
        // Part Time Additional requirements
        double monthlySalary;
        double hourlyRate;

        Employee newEmployee;

        switch (userChoice) {
            case 1:
                name = promptName();
                address = promptAddress();
                phoneNumber = promptPhoneNumber();
                isPhDHolder = promptIsPhDHolder();
                isMasterHolder = promptIsMasterHolder();
                annualSalary = promptAnnualSalary();
                hasAdditionalDuty = promptHasAdditionalDuty();
                newEmployee = new Admin(staffCounter++, name, address, phoneNumber,
                        isPhDHolder, isMasterHolder, annualSalary, hasAdditionalDuty);
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
                name = promptName();
                address = promptAddress();
                phoneNumber = promptPhoneNumber();
                isPhDHolder = promptIsPhDHolder();
                isMasterHolder = promptIsMasterHolder();
                hourlyRate = promptHourlyRate();
                newEmployee = new PartTimeTutor(staffCounter++, name, address, phoneNumber,
                        isPhDHolder, isMasterHolder, hourlyRate);
                employees.add(newEmployee);
                break;
            default:
                System.out.println("invalid entry, addEmployeeToTheSystem()");
                exit(1);
        }
        System.out.println("new employee added successfully");
    }

    private boolean promptHasAdditionalDuty() {
        String input = "";
        do {
            System.out.println("Does the admin have an additional duty position? (yes/no):");
            input = scanner.next().trim().toLowerCase();
            if (!input.equals("yes") && !input.equals("no")) {
                System.out.println("Invalid entry: Please enter 'yes' or 'no'.");
            }
        } while (!input.equals("yes") && !input.equals("no"));
        return input.equals("yes");
    }

    private void recordMonthlyHoursForPartTimeTutor() {
        long employeeId = promptEmployeeId();

        Employee foundEmployee = null;
        for (Employee employee : employees) {
            if (employee.getStaffId() == employeeId) {
                foundEmployee = employee;
                break;
            }
        }

        if (foundEmployee == null) {
            System.out.println("No employee found with ID: " + employeeId);
            return;
        }

        if (!(foundEmployee instanceof PartTimeTutor)) {
            System.out.println("Employee with ID " + employeeId + " is not a Part Time Tutor.");
            return;
        }

        PartTimeTutor partTimeTutor = (PartTimeTutor) foundEmployee;
        int year = promptYear();
        int month = promptMonth();
        double hoursWorked = promptHoursWorked();

        PartTimeRecord record = new PartTimeRecord(year, month, hoursWorked);
        partTimeTutor.getNumberOfHoursList().add(record);

        System.out.println("Monthly hours recorded successfully for " + partTimeTutor.getName());
    }

    private long promptEmployeeId() {
        long employeeId = 0;
        boolean valid = false;
        do {
            System.out.println("Enter employee ID:");
            try {
                employeeId = Long.parseLong(scanner.next());
                if (employeeId <= 0) {
                    System.out.println("Invalid entry: Employee ID must be greater than 0.");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry: Employee ID must be a valid number.");
            }
        } while (!valid);
        return employeeId;
    }

    private int promptYear() {
        int year = 0;
        boolean valid = false;
        do {
            System.out.println("Enter year:");
            try {
                year = Integer.parseInt(scanner.next());
                if (year < 1990 || year > 2026) {
                    System.out.println("Invalid entry: Please enter a valid year between 1990 and 2026.");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry: Year must be a valid number.");
            }
        } while (!valid);
        return year;
    }

    private int promptMonth() {
        int month = 0;
        boolean valid = false;
        do {
            System.out.println("Enter month (1-12):");
            try {
                month = Integer.parseInt(scanner.next());
                if (month < 1 || month > 12) {
                    System.out.println("Invalid entry: Month must be between 1 and 12.");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry: Month must be a valid number.");
            }
        } while (!valid);
        return month;
    }

    private double promptHoursWorked() {
        double hoursWorked = 0;
        boolean valid = false;
        do {
            System.out.println("Enter number of hours worked this month:");
            try {
                hoursWorked = Double.parseDouble(scanner.next());
                if (hoursWorked <= 0) {
                    System.out.println("Invalid entry: Hours worked must be greater than 0.");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry: Hours worked must be a valid number.");
            }
        } while (!valid);
        return hoursWorked;
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
            System.out.println("Enter employee address: (spaces are not allowed, use '-' instead for separation)");
            address = scanner.next().trim();
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