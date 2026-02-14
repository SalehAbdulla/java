public class Main {
    public static void main(String[] args) {
        printInfo("Hello World");
        printInfo("");
        printInfo("\t   \n");
        System.out.println("-".repeat(20));
        String helloWorld = "Hello World";

        System.out.printf("index of r = %d %n", helloWorld.indexOf('r', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        String myName = "saleh";
        String myNameUpper  = "SALEH";
        if (myName.equals(myNameUpper)) {
            System.out.println("not the same");
        }

        if (myName.equalsIgnoreCase(myNameUpper)) {
            System.out.println("they are the same ignoring the case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("it starts with Hello");
        }

        if (helloWorld.endsWith("World")) {
            System.out.println("it ends with World");
        }

        if (helloWorld.contains("World")) {
            System.out.println("it contains World");
        }

        if (myName.contentEquals("Hello World")) {
            System.out.println("they are the same");
        }

    }

    public static void printInfo(String word) {
        int length = word.length();
        System.out.printf("Length = %d \n", length);
        if (word.isEmpty()) {
            System.out.println("word is empty.");
            return;
        }
        System.out.printf("First Char = %c \n", word.charAt(0));

        System.out.printf("Last Char = %c \n", word.charAt(length - 1));

    }



}