package dev.lpa;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello World Again");

        String[] splitsString = "Hello World Again".split(" ");
        printText(splitsString);

        System.out.println("-".repeat(30));
        printText("Hello", "Hi", "Salam");

        System.out.println("-".repeat(30));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));


    }

    private static void printText(String... textList){
        for (String element : textList){
            System.out.println(element);
        }
    }
}
