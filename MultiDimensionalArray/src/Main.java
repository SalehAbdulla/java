import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println("Array's length = " + array2.length);

        for (int[] outer: array2){
            System.out.println(Arrays.toString(outer));
        }

//        for (int i = 0; i < array2.length; i++){
//            for (int j = 0; j < array2.length; j++){
//                System.out.println(array2[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int[] outer : array2){
            for (int inner : outer){
                System.out.print(inner + "  ");
            }
            System.out.println();
        }

    }
}