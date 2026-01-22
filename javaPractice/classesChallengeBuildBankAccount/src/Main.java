public class Main {
    public static void main(String[] args) {
        BankAccount savingAccount = new BankAccount(1234, 1_000_000, "SALEH", "SALEH@GMAIL.COM", "1234566");
        savingAccount.setCustomerName("Saleh");

        savingAccount.setAccountNumber(123456);
        savingAccount.setEmail("SALEH@GMAIL.COM");

        savingAccount.depositFunds(1_000_000);
        savingAccount.withdrawingFunds(10);


    }
}
