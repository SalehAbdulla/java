public class HourlyEmployee extends Employee{
    double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate,double hourlyPayRate){
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        double payCheck = hourlyPayRate * 40;
        return (int) payCheck;
    }

    public double getDoublePay(){
        double payCheck = collectPay() * 2;
        return (int) payCheck;
    }

}
