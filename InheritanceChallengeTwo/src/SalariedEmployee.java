public class SalariedEmployee extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary){
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double salary = annualSalary / 24;
        double adjustedSalary = (isRetired) ? salary * 90 : salary;
        return (int) adjustedSalary;
    }

    public void retire(String endDate){
        terminate(endDate);
        isRetired = true;
    }

}