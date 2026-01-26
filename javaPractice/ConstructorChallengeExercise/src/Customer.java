public record Customer(String name, double creditLimit, String email) {

    public Customer() {
        this("unknown", 1000.0, "unknow@unknown.com");
    }

    public Customer(String name, String email) {
        this(name, 1000.0, email);
    }

}
