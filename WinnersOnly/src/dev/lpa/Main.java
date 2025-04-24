package dev.lpa;

public class Main {
    public static void main(String[] args) {
        drawStars(2);
    }

    public static void drawStars(int n) {

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

