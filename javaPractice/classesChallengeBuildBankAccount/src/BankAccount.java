public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String number;





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
