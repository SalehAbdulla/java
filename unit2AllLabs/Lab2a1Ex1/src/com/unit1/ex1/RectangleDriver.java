package com.unit1.ex1;

import java.util.Scanner;

public class RectangleDriver {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to com.unit1.ex1.Rectangle program that will make your life easier");
        Rectangle rectangle = new Rectangle();

        System.out.println("Please insert the width: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        System.out.println("Please insert the length");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        System.out.printf("The Length is: %.2f%n", length);
        System.out.printf("The Width is: %.2f%n", width);

        System.out.println("The area = " + rectangle.calculateArea());
        System.out.println("The perimeter = " + rectangle.calculatePerimeter());
    }

}
