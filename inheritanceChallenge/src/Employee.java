public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate){
        super(name, birthDate);
    }

    public Employee(String name, String birthDate, long employeeId, String hireDate) {
        this(name, birthDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

}
