import java.text.DecimalFormat;

public class BankAccount {

    private long accountNumber;
    private double accountBalance = 1000000000;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber + 1;
        this.accountBalance = 20.0;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
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

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // ------------------

    public static String formatText(double amount) {
        DecimalFormat fmt = new DecimalFormat("#,###.00");
        return fmt.format(amount);

    }

    public void depositingFunds(double amount) {
        accountBalance += amount;
        System.out.println("The Amount BHD" + formatText(amount) + " deposited successfully, you account balance is BHD" + formatText(this.accountBalance));
    }

    public void withdrawFunds(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("The Amount BHD" + formatText(amount) +" withdraw successfully, you account balance is BHD"+ formatText(this.accountBalance));
        } else {
            System.out.println("Not enough Money for withdraw process");
        }

    }

    @Override
    public String toString() {
        return " Account #" + accountNumber + " | Name: " + customerName + " | Balance: BHD" + formatText(accountBalance);
    }


}
