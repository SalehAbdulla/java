package dev.lpa;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}


public class Main {
    public static void main(String[] args) {
        Customer saleh = new Customer("Saleh", 1_000_000);
        System.out.println(saleh);

        Bank bank = new Bank("Saleh");
        bank.addNewCustomer("Saleh", 500.0);
        System.out.println(bank);

        bank.addTransaction("Saleh", -10.25);
        bank.addTransaction("Saleh", 100);

        bank.printStatement("Saleh");

    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private Customer getCustomer(String customerName){
        for (var customer: customers) {
            if (customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit){
        if (getCustomer(customerName) == null){
            customers.add(new Customer(customerName, initialDeposit));
            System.out.println("New Customer Added: " + customerName);
        }
    }

    public void addTransaction(String name, double transactionAmount) {

        Customer customer = getCustomer(name);
        if (customer != null){
            customer.transactions().add(transactionAmount);
        }
    }


    public void printStatement(String customerName){

        Customer customer = getCustomer(customerName);
        if (customer == null){
            return;
        }
        System.out.println("_".repeat(30));

        System.out.println("Customer name: " + customer.name());
        System.out.println("Transactions:");
        for (double d: customer.transactions()){
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "Debit" : "Credit");
        }
    }
}