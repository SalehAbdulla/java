public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50,
        "Default name", "Default email address", "Default phoneNumber");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositingFunds(double depositedAmount){
        this.balance += depositedAmount;
        System.out.println(depositedAmount +" deposited. Your Balance is = " + this.balance);
    }

    public void withdrawingFunds(double withdrawAmount) {
        double withdrawAmountChecker = this.balance -= withdrawAmount;
        String result = (withdrawAmountChecker) > 0 ? withdrawAmount + " withdrawal processed. Here is your account balance " + this.balance : "Not enough amount for funding, remaining balance = " + this.balance;
        System.out.println(result);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }



}
