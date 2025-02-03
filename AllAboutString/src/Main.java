public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\n   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of r = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of r = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of r = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf('l', 8));

        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if (helloWorld.startsWith("Hello")){
            System.out.println("String starts with hello");
        }

        if (helloWorld.contentEquals("Hello")){
            System.out.println("String starts with hello");
        }

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorldLower.equals(helloWorldLower)){
            System.out.println("Value matches exactly");
        }

        if (helloWorldLower.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Value matches ignoring case");
        }


    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()){
            System.out.println("String is Blank");
        }

        System.out.printf("Last char = %c %n", string.charAt(length - 1));



    }
}