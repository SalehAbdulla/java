import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
                                // 0     1          2        3
        String[] hussainStuff = {"PC", "iPhone", "Airpods", "PS"};

        System.out.println(hussainStuff[0]);
        System.out.println(hussainStuff[1]);
        System.out.println(hussainStuff[2]);
        System.out.println(hussainStuff[3]);

        System.out.println("-".repeat(20));

        for (int i = 0; i < hussainStuff.length; i++) {
            System.out.println(hussainStuff[i]);
        }

        System.out.println("-".repeat(20));


        for (String element : hussainStuff) {
            System.out.println(element);
        }

        System.out.println("-".repeat(20));


        int i = 0;

        while(i < hussainStuff.length) {
            System.out.println(hussainStuff[i]);
            i++;
        }




    }
}
