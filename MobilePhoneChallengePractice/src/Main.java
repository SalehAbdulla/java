public class Main {
    public static void main(String[] args) {

        MobilePhone myMobile = new MobilePhone("38389522");

        Contact firstContact = new Contact("Saleh", "38389522");
        Contact secondContact = new Contact("Kawther", "33995565");

        myMobile.addNewContact(firstContact);
        myMobile.addNewContact(secondContact);

        myMobile.printContacts();




    }
}