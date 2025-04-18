package dev.lpa;

import java.util.ArrayList;

public class Bank {
    String bankName;
    ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName.toUpperCase();
        customers = new ArrayList<>();
    }

    public boolean addNewCustomer(String customerName){
        for (Customer c: customers){
            if (c.name.equalsIgnoreCase(customerName)){
                return false;
            }
        }
        return customers.add(new Customer(customerName.toUpperCase()));
    }

    public boolean addTransaction(String customerName, double transaction) {
        for (Customer c: customers){
            if (c.name.equalsIgnoreCase(customerName)){
                return c.transactions.add(transaction);
            }
        }
        return false;
    }

    public void printStatement(String customerName){
        for (Customer c: customers){
            if (c.name.equalsIgnoreCase(customerName)){
                System.out.println("Customer name = " + c.name);
                System.out.println("Customer transaction = " + c.transactions);
            }
        }
    }

}
