import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
                        // 0    ,    1      ,  2
        String[] fruit = {"apple", "orange", "banana"}; // First way
        String[] friends = new String[5]; // 2nd Way

        // How to print the Array?
//        System.out.println(Arrays.toString(fruit));

        // How to print a specific element (apple) using index?
//        System.out.println(fruit[1]);

        // How to print elements using c-Style loop
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }

        // How to print elements using ForEach style
        for (String f: fruit) {
            System.out.println(f);
        }

        // How to change an element inside the array
        fruit[2] = "pineapple";
        System.out.println(Arrays.toString(fruit));


    }
}