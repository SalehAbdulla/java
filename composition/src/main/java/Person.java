import java.util.ArrayList;

public class Person {
    String firstName;
    String lastName;
    int age;
    ArrayList<Device> deviceArrayList;

    // 1 - 0..*
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.deviceArrayList = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Device> getDeviceArrayList() {
        return deviceArrayList;
    }

    public void buyDevice(Device device) {
        deviceArrayList.add(device);
        device.setOwnerPerson(this);
    }
}
