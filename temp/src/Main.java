import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printDescendingOrder(1, 2, 3);
    }

    public static void printDescendingOrder(int value1, int value2, int value3){

        //enter your code here
        int[] array = new int[] {value1, value2, value3};
        Arrays.sort(array);
        print(array[0], array[1], array[2]);

    }

    // Method to print the values in descending order
    public static void print(int value1, int value2, int value3) {
        System.out.println("Values in descending order are: "+value1+" "+value2+" "+value3+".");
    }
}