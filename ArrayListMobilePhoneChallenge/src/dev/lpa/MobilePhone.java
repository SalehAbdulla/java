package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {
    //    -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
    String myNumber;
    ArrayList<Contacts> myContacts;

    //    -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    //    -  And seven methods, they are (their functions are in their names):

    //        -  addNewContact(), has one parameter of type Contact and returns a boolean.
    //        Returns true if the contact doesn't exists, or false if the contact already exists.

    public boolean addNewContact(Contacts contact){
        if (myContacts.contains(contact)){
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }



    //        -  updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
    //
    //        -  removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
    //
    //        -  findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
    //
    //        -  findContact(), same as above, only it has one parameter of type String.
    //
    //        -  queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
    //
    //        -  printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:

    public void printContacts(){
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println(myContacts.get(i).name + " -> " + myContacts.get(i).number);
        }
    }

    //Contact List:
    //1. Bob -> 31415926
    //2. Alice -> 16180339
    //3. Tom -> 11235813
    //4. Jane -> 23571113
}
