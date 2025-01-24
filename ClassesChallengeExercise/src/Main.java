public class Main {
    public static void main(String[] args) {

        BankAccount saving = new BankAccount();
        saving.setCustomerName("Saleh");
        saving.setAccountNumber("12345");
        saving.setBalance(10_000);
        saving.setEmail("Salehabdullaict@gmail.com");
        saving.setPhoneNumber("38389522");


        double mySavingAccountBalance = saving.getBalance();
        System.out.println("My saving account balance is = " + mySavingAccountBalance);


        saving.depositingFunds(1);
        saving.withdrawingFunds(1);


    }
}