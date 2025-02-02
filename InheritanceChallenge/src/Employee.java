public class Employee extends Worker {

    private long employeeId;
    private String hireDate;
    protected static long employeeNo;

    public Employee(String name, String birthDate, String hireDate){
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = Employee.employeeNo++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}