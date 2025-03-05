public class Main {
    public static void main(String[] args) {

        EmployeeClass employeeClass = new EmployeeClass("Jerry", 5);

        EmployeeRecord employeeRecord = new EmployeeRecord("Kramer", 54321);

        System.out.println(employeeClass.getName());
        System.out.println(employeeRecord.name());
    }
}