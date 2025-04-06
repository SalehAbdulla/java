package dev.lpa;

public class Main {
    public static void main(String[] args) {

        MobilePhone iphone = new MobilePhone("38389522");
        Contacts saleh = new Contacts("Saleh", 38389522);
        iphone.addNewContact(saleh);

        iphone.printContacts();

    }
}