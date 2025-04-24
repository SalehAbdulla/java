package dev.lpa;

public class PrintOddNumbers {
    public static void main(String[] args) {
        int startValue = 7;
        int stopValue = 11;
        printOddNumber(startValue, stopValue);
    }

    public static void printOddNumber(int startValue, int endValue) {
        for (int i = startValue; i <= endValue; i++) {
            if (i % 2 == 1 || i % 2 == -1) {
                System.out.println(i);
            }
        }
    }
}
