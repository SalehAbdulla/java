public class Main{
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder stringBuilder = new StringBuilder("Hello World");
        stringBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(stringBuilder);


        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);


        builderPlus.replace(16, 17, "G");
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);

    }

    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("String Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("builder = " + builder);
        System.out.println("builder Length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }

}