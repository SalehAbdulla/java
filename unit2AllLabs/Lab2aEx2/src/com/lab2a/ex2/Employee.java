package com.lab2a.ex2;

import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private int idNumber;
    private String position;

    public static Scanner scanner = new Scanner(System.in);

    public Employee(){
        this.firstName = "default";
        this.lastName = "default";
        this.idNumber = 0;
        this.position = "default";
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        if (idNumber < 0) {
            while (true) {
                System.out.println("Id number must be positive, please re-enter employee's id number again: ");
                int idNumberPrompt = scanner.nextInt();
                if (idNumberPrompt >= 0) {
                    this.idNumber = idNumberPrompt;
                    break;
                }
            }
        } else {
            this.idNumber = idNumber;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
