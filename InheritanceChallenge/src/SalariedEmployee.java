public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary){
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary * 26;
        double adjustedPaycheck = (isRetired) ? paycheck * 90 : paycheck;
        return (int) adjustedPaycheck;
    }

    public void retire(String endDate){
        terminate(endDate);
        isRetired = true;
    }


}