public class FirstClass {
    public static void main (String [] args) {
        int ageOfClient = 20;
        // Ternary operator a way of replacing if-else statement
        String ageText = (ageOfClient >= 18) ? "Big Boy" : "Still a kid";
        System.out.println(ageText);
    }
}