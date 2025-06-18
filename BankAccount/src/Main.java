public class Main {
    public static void main(String[] args) {
        BankAccount saving = new BankAccount("Saleh", "Saleh@gmail.com", "123-23-111");
        saving.depositingFunds(1000);
        saving.withdrawFunds(59);


        System.out.println(saving.toString());



    }
}