import java.util.Scanner;

public class VolumeDriver {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cube cube = new Cube();
        System.out.println("please insert the radius of the Cube");
        cube.setWidth(getUserDoubleVal());

        Sphere sphere = new Sphere();
        System.out.println("please insert the radius of the Sphere");
        sphere.setRadius(getUserDoubleVal());

        System.out.println("Cube width = " + cube.getWidth() + " Cube Volume " + cube.displayVolume()) ;
        System.out.println("Sphere radius = " + sphere.getRadius() + " Cube Volume " + sphere.displayVolume()) ;


    }


    public static double getUserDoubleVal(){

        double res = 0;

        do {
            try {
                res = Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("You must insert a number!");;
                continue;
            }

            if (res == 0 || res > 1_000_000) {
                System.out.println("input cannot be zero or greater than 1 million!");
                res = 0;
            }

        } while (res == 0);

        return res;
    }

}
