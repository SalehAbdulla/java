import java.util.ArrayList;

public class Bank {
    //1.  Bank
    //-  It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.

    String name;
    ArrayList<Branch> branches;

    //-  A constructor that takes a String (name of the bank). It initialises name and instantiates branches.

    public Bank(String name){
        this.name = name;
        branches = new ArrayList<>();
    }

    //-  And five methods, they are (their functions are in their names):
    //
    //    -  addBranch(), has one parameter of type String (name of the branch) and returns a boolean. It returns true if the branch was added successfully or false otherwise.
    //
    //    -  addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), double (initial transaction) and returns a boolean. It returns true if the customer was added successfully or false otherwise.
    //
    //    -  addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer), double (transaction) and returns a boolean. It returns true if the customers transaction was added successfully or false otherwise.
    //
    //    -  findBranch(), has one parameter of type String (name of the Branch) and returns a Branch. Return the Branch if it exists or null otherwise.
    //
    //    -  listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean. Return true if the branch exists or false otherwise. This method prints out a list of customers.
}
