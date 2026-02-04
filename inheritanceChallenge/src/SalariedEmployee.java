public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate){
        super(name, birthDate, employeeId, hireDate);
    }

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        this(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire() {
        this.isRetired = true;
    }
}
