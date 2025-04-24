package dev.lpa;

public class Products {
    public static void main(String[] args) {
        products(-10, -4);
    }

    public static void products(int startValue, int stopValue) {
        int result = 1;
        for (int i = startValue; i <= stopValue; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
