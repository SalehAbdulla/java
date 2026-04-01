import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.exit;


public class ShapeApp {

    private final Scanner scanner = new Scanner(System.in);
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void promptUser() {
        String wishToContinue = "";
        int userChoice = 0;

        do {
            do {
                System.out.println("""
                    What type of shape would you like to create?
                    Enter 1 for Circle or 2 for Rectangle
                    """);

                try {
                    userChoice = Integer.parseInt(scanner.next());
                } catch (NumberFormatException e) {
                    System.out.println("choice must be a number, Either 1  or 2");
                    continue;
                }

                if (userChoice != 1 && userChoice != 2) {
                    System.out.println("choice must be a number, Either 1  or 2");
                    userChoice = 0;
                }

            } while (userChoice == 0);

            Shape newShape;

            if (userChoice == 1) {
                System.out.println("You have chosen to create a Circle.");
                newShape = (Circle) new Circle();
                // Some logic
                double radius = 0;
                do {
                    System.out.println("Please enter the circle radius.");
                    try {
                        radius = Double.parseDouble(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("radius must be a number!");
                    }

                } while (radius == 0);

                ((Circle) newShape).setRadius(radius);
                shapes.add(newShape);
                System.out.println("A circle has been created.");

            } else {
                System.out.println("You have chosen to create a Rectangle.");
                newShape = (Rectangle) new Rectangle();
                // Some logic
                double length = 0;
                double width = 0;

                do {
                    System.out.println("Please enter the rectangle length.");
                    try {
                        length = Double.parseDouble(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("length must be a number");
                    }

                } while (length == 0);

                do {
                    System.out.println("Please enter the rectangle width.");
                    try {
                        width = Double.parseDouble(scanner.next());

                    } catch (NumberFormatException e) {
                        System.out.println("width must be a number");
                    }

                } while (width == 0);

                ((Rectangle) newShape).setLength(length);
                ((Rectangle) newShape).setWidth(width);
                shapes.add(newShape);

                System.out.println("A rectangle has been created.");
            }
            boolean isValidInput;
            do {
                System.out.println("Do you wish to continue? (Y/N)");
                wishToContinue = scanner.next().toLowerCase().trim();
                if (wishToContinue.equals("y") || wishToContinue.equals("yes")) {
                    wishToContinue = "";
                    isValidInput = true;
                } else if (wishToContinue.equals("n") || wishToContinue.equals("no")) {
                    isValidInput = true;
                } else {
                    System.out.println("Invalid input");
                    isValidInput = false;
                }
            } while (!isValidInput);

        } while (wishToContinue.isEmpty());

        // Get Area of All Recatngles/Circles Logic
        int userChoiceToHaveArea = 0;
        do {
            System.out.println("""
                Which shapes would you like to print the area of? (Enter 1 for Circles or 2 for Rectangles)
                """);
            try {
                userChoiceToHaveArea = Integer.parseInt(scanner.next());
                if (userChoiceToHaveArea != 1 && userChoiceToHaveArea != 2) {
                    System.out.println("invalid entry, (Enter 1 for Circles or 2 for Rectangles)");
                    userChoiceToHaveArea = 0;
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid entry, (Enter 1 for Circles or 2 for Rectangles)");
            }
        } while (userChoiceToHaveArea == 0);

        double totalArea = 0;
        if (userChoiceToHaveArea == 1) {
            for (Shape shape: shapes) {
                if (shape instanceof Circle) {
                    totalArea += getArea(shape);
                }
            }
            System.out.println("Circle area = " + totalArea);
        } else if (userChoiceToHaveArea == 2) {
            for (Shape shape: shapes) {
                if (shape instanceof Rectangle) {
                    totalArea += getArea(shape);
                }
            }
            System.out.println("Rectangle area = " + totalArea);
        } else {
            System.out.println("invalid user choice in have all area logic");
            exit(500);
        }

    }

    private double getArea(Shape shape) {
        if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getLength() * ((Rectangle) shape).getWidth();
        } else if (shape instanceof Circle) {
            double r = ((Circle) shape).getRadius();
            return Math.PI * Math.pow(r, 2);
        } else {
            System.out.println("un-supported shape");
            return 0.0;
        }
    }

}
