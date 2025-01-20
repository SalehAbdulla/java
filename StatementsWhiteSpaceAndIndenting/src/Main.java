public class Main {
    public static void main(String[] args) {
        int myVariable = 50;

        // With the ; creates a statement, without ; it is only an expression
        myVariable++;  // Complete Statement
        myVariable--;  // Complete Statement

        System.out.println("result = " + myVariable);

        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);

        // Statements don't have to be in a new line
        System.out.println("This is" +
                " another" +
                " still more.");
    }
}

