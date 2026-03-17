import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();

        System.out.println("-".repeat(20));
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("-".repeat(20));
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum()
        );

        System.out.println("-".repeat(20));
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("-".repeat(20));
        String[] names = {"Ali", "Ankit", "Brent", "Kushal", "Sarika", "amanda", "Hans", "Shivika", "Saleh"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("-".repeat(20));
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

        System.out.println("-".repeat(20));
        List<String> people = Arrays.asList("Ali", "Ankit", "Brent", "Kushal", "Sarika", "amanda", "Hans", "Shivika", "Saleh");
        people.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        System.out.println("-".repeat(20));
        try {
            List<String> bands = Files.readAllLines(Paths.get("src/bands.txt"));
            bands.stream()
                    .sorted()
                    .filter(x -> x.toLowerCase().startsWith("a"))
                    .filter(x -> x.length() > 5 && x.length() < 10)
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("-".repeat(20));
        List<String> result;

        try (Stream<String> bands2 = Files.lines(Paths.get("src/bands.txt"))) {
            result = bands2
                    .filter(x -> x.contains("j"))
                    .toList();
        }

        result.forEach(System.out::println);

        System.out.println("-".repeat(20));
        try {
            Stream<String> data = Files.lines(Paths.get("src/data.csv"));
            data
                    .map(x -> x.split(","))
                    .filter(x -> x.length == 4)
//                    .count()
                    .forEach(arr -> System.out.println(Arrays.toString(arr)));
        } catch (Exception e) {
            System.out.println(e);
        }





    }

}
