public class Main {
    public static void main(String[] args) {
        // Create by default constructor data
        Customer customerOne = new Customer();
        System.out.println(customerOne.getName());
        System.out.println(customerOne.getCreditLimit());
        System.out.println(customerOne.getEmailAddress());

        // Create by passing data to constructor
        Customer customerTwo = new Customer("Fatima", 1234.0,"main@main.com");
        System.out.println(customerTwo.getName());
        System.out.println(customerTwo.getCreditLimit());
        System.out.println(customerTwo.getEmailAddress());

        // Create by passing data to constructor
        Customer customerThree = new Customer("Joe", "Joe@main.com");
        System.out.println(customerThree.getName());
        System.out.println(customerThree.getCreditLimit());
        System.out.println(customerThree.getEmailAddress());

    }
}