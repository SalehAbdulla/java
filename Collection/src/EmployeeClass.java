public class EmployeeClass {
    private final String name;
    private final int employeeNumber;

    public EmployeeClass (String name, int employeeNumber){
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName(){
        return name;
    }

    public int getEmployeeNumber(){
        return employeeNumber;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
