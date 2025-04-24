package dev.lpa;

public class SumOfValues {
    public static void main(String[] args) {
        int startValue = 5;
        int stopValue = 60;
        int step = 3;
        sumOfValues(startValue, stopValue, step);
    }

    public static void sumOfValues(int start, int end, int step) {
        int sumOfEveryThreeStep = 0;
        for (int i = start; i <= end; i = i + step) {
            sumOfEveryThreeStep += i;
        }
        System.out.println(sumOfEveryThreeStep);
    }
}
