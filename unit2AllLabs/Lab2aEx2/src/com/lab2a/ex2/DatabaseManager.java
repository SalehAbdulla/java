package com.lab2a.ex2;

import java.util.Scanner;

public class DatabaseManager {

    public static Scanner scanner1 = new Scanner(System.in);
    public static Scanner scanner2 = new Scanner(System.in);
    public static Scanner scanner3 = new Scanner(System.in);
    public static Scanner scanner4 = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println("enter employee first name: ");
        String firstNameInput = scanner1.nextLine();
        employee.setFirstName(firstNameInput);

        System.out.println("enter employee last name: ");
        String lastNameInput = scanner2.nextLine();
        employee.setLastName(lastNameInput);


        System.out.println("enter employee id number: ");
        int idNumberInput = scanner3.nextInt();
        employee.setIdNumber(idNumberInput);

        System.out.println("enter employee position");
        String positionUserInput = scanner4.nextLine();
        employee.setPosition(positionUserInput);


        System.out.println("Employee first name: "+ employee.getFirstName());
        System.out.println("Employee last name: "+ employee.getLastName());
        System.out.println("Id Number: "+ employee.getIdNumber());
        System.out.println("Position: "+ employee.getPosition());

    }
}
