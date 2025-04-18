package dev.lpa;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Double> transactions;

    public Customer(String name){
        this.name = name;
        transactions = new ArrayList<>();
    }

}
