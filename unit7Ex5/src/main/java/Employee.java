import java.io.Serializable;

// Employee class - Serializable
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String familyName;
    private String address;
    private String phoneNumber;

    // Custom constructor
    public Employee(String firstName, String familyName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getFamilyName() { return familyName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setFamilyName(String familyName) { this.familyName = familyName; }
    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + familyName +
                "\nAddress: " + address +
                "\nPhone: " + phoneNumber + "\n";
    }
}
