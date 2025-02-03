public class Main {
    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
              Print a Bulleted List:
                \u2022 First Point
                \u2022 Sub Point
              """;

        System.out.println(textBlock);
        int age = 35;

        System.out.printf("You age is %d%n", age);

        int yearOfBirth = 2023;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("You age is %.2f%n", (double) age);


        for (int i = 1; i <= 100_000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}