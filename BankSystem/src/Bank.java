import java.util.ArrayList;

public class Bank {
    //1.  Bank
    //-  It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.

    String name;
    ArrayList<Branch> branches;

    //-  A constructor that takes a String (name of the bank). It initialises name and instantiates branches.

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    //-  And five methods, they are (their functions are in their names):
    //    -  addBranch(), has one parameter of type String (name of the branch) and returns a boolean.
    //    It returns true if the branch was added successfully or false otherwise.
    public boolean addBranch(String name) {
        return branches.add(new Branch(name));
    }

    //    -  addCustomer(), has three parameters of type String (name of the branch),
    //    String (name of the customer), double (initial transaction) and returns a boolean.
    //    It returns true if the customer was added successfully or false otherwise.
    public boolean addCustomer(String nameOfTheBranch, String customerName, double initialTransaction) {
        for (Branch branch: branches){
            if (branch.getName().equalsIgnoreCase(nameOfTheBranch)){
                branch.newCustomer(customerName, initialTransaction);
                return true;
            } else {
                return false;
            }
        }

    }
    //    -  addCustomerTransaction(), has three parameters of type String (name of the branch),
    //    String (name of the customer), double (transaction) and returns a boolean.
    //    It returns true if the customers transaction was added successfully or false otherwise.

    public boolean addCustomerTransaction(String branchName,String customerName, double transaction){
        for (Branch branch: branches){
            if (branch.getName().equalsIgnoreCase(branchName)){
                branch.addCustomerTransaction(customerName, transaction);
                return true;
            }
        }
        return false;
    }


    //    -  findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
    //    Return the Branch if it exists or null otherwise.

    public boolean findBranch(String name){
        for (Branch branch: branches){
            if (branch.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    //    -  listCustomers(), has two parameters of type String (name of the Branch),
    //    boolean (print transactions) and returns a boolean.
    //    Return true if the branch exists or false otherwise. This method prints out a list of customers.

    public boolean listCustomer(Branch name, boolean printTransactions){
        for (Branch branch: branches){
            if (branch.getName().equalsIgnoreCase(name.name)){
                if (printTransactions) System.out.println();
                return true;
            }
        }
        return false;
    }

}
