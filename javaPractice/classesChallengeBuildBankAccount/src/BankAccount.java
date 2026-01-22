public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String number;

    public BankAccount(){
        this(12345, 2222222, "Default name", "Default email", "Default Phone");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName) {
        this(accountNumber, accountBalance, customerName, "Default", "Default");
            //        this.accountNumber = accountNumber;
            //        this.accountBalance = accountBalance;
            //        this.customerName = customerName;
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String number){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.number = number;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void depositFunds(double amount) {
        this.accountBalance += amount;
        System.out.println(amount + " deposited successfully, your balance: " + this.accountBalance);
    }

    public void withdrawingFunds(double amount) {
        if (accountBalance - amount < 0) {
            System.out.println("insufficient account balance");
            return;
        }
        this.accountBalance = this.accountBalance - amount;
        System.out.println("Here is your amount: " + amount + " Your Balance: " + this.accountBalance);
    }

}
