import java.util.ArrayList;

public class Customer {
    //3.  Customer
    //
    //    -  It has two fields, A String called name and an ArrayList that holds objects of type Double called transactions.
    String name;
    ArrayList<Double> transactions;

    //    -  A constructor that takes a  String (name of customer) and a double (initial transaction).
    //    It initialises name and instantiates transactions.
    public Customer(String name) {
        this.name = name;

    }
    //    -  And three methods, they are (their functions are in their names):

    //        -  getName(), getter for name.
    public String getName() {
        return name;
    }

    //        -  getTransactions(), getter for transactions.
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    //        -  addTransaction(), has one parameter of type double (transaction) and doesn't return anything.
    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}
