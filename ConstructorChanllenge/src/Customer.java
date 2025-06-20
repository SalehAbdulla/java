public class Customer {
    private String name;
    private int creditLimit;
    private String emailAddress;


    public Customer(String name, String emailAddress){
        this(name, 100, emailAddress);
    }


    public Customer() {
        this("Default Name", 120, "Default Email Address");
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
