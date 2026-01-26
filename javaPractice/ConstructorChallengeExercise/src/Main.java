public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.name());
        System.out.println(customer.email());
        System.out.println(customer.creditLimit());


        Customer customer2 = new Customer("Saleh", 10000, "salehabdullaict@gmail.com");
        System.out.println(customer2.name());
        System.out.println(customer2.email());
        System.out.println(customer2.creditLimit());


        Customer customer3 = new Customer("Saleh", "salehabdullaict@gmail.com");
        System.out.println(customer3.name());
        System.out.println(customer3.email());
        System.out.println(customer3.creditLimit());
    }
}
