package dev.lpa;

public class Main {

    public static void main(String[] args) {
        Bank sasBank = new Bank("SAS");
        sasBank.addNewCustomer("Saleh");
        sasBank.addTransaction("Saleh",1_000_000.0);
        sasBank.addTransaction("Saleh",7_000_000.0);
        sasBank.addTransaction("Saleh",10_000_000.0);
        sasBank.printStatement("Saleh");
    }

}