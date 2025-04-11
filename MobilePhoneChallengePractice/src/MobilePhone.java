import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    // Add a new contact and check if contact number exists before -- searching by name --
    public boolean addNewContact(Contact newContact) {
        for (Contact contact : myContacts) {
            if (contact.getName().equalsIgnoreCase(newContact.getName())) {
                return false;
            }
        }
        myContacts.add(newContact);
        return true;
    }

    // Update contact as requested -- passing in oldContact with newContact --
    public boolean updateContact(Contact oldContact, Contact newContact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(oldContact.getName())) {
                myContacts.set(i, newContact);
                return true;
            }
        }
        return false;
    }

    // remove contact
    public boolean removeContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(contact.getName())) {
                myContacts.remove(i);
                return true;
            }
        }
        return false;
    }

    /*
    -  findContact(), has one parameter of type Contact and returns an int.
    The returned value is it's position in the ArrayList,
    it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
     */

    public int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(contact.getName())) {
                return 0;
            }
        }
        return -1;
    }

    // findContact(), same as above, only it has one parameter of type String.

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(name)) {
                return 0;
            }
        }
        return -1;
    }

    //        -  queryContact(), has one parameter of type String and returns a Contact.
    //        Use the String to search for the name and then return the Contact. Return null otherwise.

    public Contact queryContact(String name) {
        if (findContact(name) >= 0) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (myContacts.get(i).getName().equalsIgnoreCase(name)) {
                    return myContacts.get(i);
                }
            }
        }
        return null;
    }


    //         -  printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
    public void printContacts() {
        int i = 0;
        while (i < myContacts.size()) {
            System.out.println((i + 1) + "." + myContacts.get(i).getName() + " -> " + myContacts.get(i).getNumber());
            i++;
        }
    }

}