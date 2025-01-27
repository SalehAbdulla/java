public class Main {
    public static void main(String[] args) {

        //BankAccount saving = new BankAccount("123456", 12_000, "Saleh", "Saleh@mail.com", "33 333 333");
        //double mySavingAccountBalance = saving.getBalance();
        //System.out.println("My saving account balance is = " + mySavingAccountBalance);
        //saving.depositingFunds(1);
        //saving.withdrawingFunds(1);

        BankAccount SalehAccount = new BankAccount();
        System.out.println(SalehAccount.getBalance());
        System.out.println(SalehAccount.getCustomerName());


    }
}