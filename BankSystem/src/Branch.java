import java.util.ArrayList;

public class Branch {
    //2.  Branch
    //
    //    -  It has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.
    String name;
    ArrayList<Customer> customers;

    //    -  A constructor that takes a String (name of the branch). It initialises name and instantiates customers.
    public Branch(String name){
        this.name = name;
        customers = new ArrayList<>();
    }
    //    -  And five methods, they are (their functions are in their names):

    //        -  getName(), getter for name.
    public String getName(){
        return name;
    }
    //        -  getCustomers(), getter for customers.
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    //  -  newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean.
    //  Returns true if the customer was added successfully or false otherwise.

    public boolean newCustomer(String name, double initialTransaction){
        Customer newCustomer = new Customer(name);
        if (customers.add(new Customer(name))){
            newCustomer.addTransaction(initialTransaction);
            return true;
        } else {
            return false;
        }
    }

    // -  addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a boolean.
    //      Returns true if the customers transaction was added successfully or false otherwise.
    public boolean addCustomerTransaction(String name, double transaction) {
        for (Customer customer: customers){
            if (customer.getName().equalsIgnoreCase(name)){
                customer.addTransaction(transaction);
                return true;
            }
        }
        return false;
    }
    //        -  findCustomer(), has one parameter of type String (name of customer) and returns a Customer.
    //        Return the Customer if they exist, null otherwise.

    public Customer findCustomer(String name){
        for (Customer customer: customers){
            if (customer.name.equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }


}
