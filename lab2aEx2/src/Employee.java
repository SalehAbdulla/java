import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private int idNumber;
    private String position;
    private Car car;

    public Employee() {
      this("unknown", "unknown", 111111111, "unknown", null);
    }

    public Employee(String firstName, String lastName, int idNumber, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.position = position;
    }

    public Employee(String firstName, String lastName, int idNumber, String position, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.position = position;
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
        car.setOwner(this);
    }

    public Car getCar() {
        return car;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        if (idNumber < 0) {

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("error: id number must be positive, please re-enter id number: ");
                idNumber = scanner.nextInt();
                if (idNumber >= 0) {
                    break;
                }
            }
        }

        this.idNumber = idNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                ", position='" + position + '\'' +
                ", car=" + car.toString() +
                '}';
    }

}
