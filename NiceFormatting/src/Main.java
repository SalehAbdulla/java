public class Main {
    public static void main(String[] args) {

        String bullitIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\u2022 Second Point";

        String bullitItWithTextBlock = """
                Print a bulleted list:
                    \u2022 First Point
                    \u2022 Second Point
                """;

        System.out.println(bullitIt);
        System.out.println(bullitItWithTextBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2026 - age;
        System.out.printf("Age = %d, Birth year = %.2f%n", age, (float) yearOfBirth);

        for (int i = 1; i <= 100_000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }



        String formatString = String.format("Your age is %d%n", age);
        System.out.println(formatString);


        formatString = "Your age is %d%n".formatted(age);
        System.out.println(formatString);

    }
}
