public class Encrypt {
    String password;
    int salting;

    public Encrypt(int salting, String password) {
        this.salting = salting;
        this.password = password;
    }

    public Encrypt() {
        this(123, "gfhgjhk");
    }

    public void cypherText() {
        System.out.println("Encryption done behind the scene!");
    }

}
