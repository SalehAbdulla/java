import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private int idNumber;
    private String position;


    public Employee() {
        this.firstName = "unknown";
        this.lastName = "unknown";
        this.idNumber = 222222222;
        this.position = "stranger";
    }

    public Employee(String firstName, String lastName, int idNumber, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.position = position;
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
}
