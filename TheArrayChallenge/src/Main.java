import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

    }

    public static int[] turnArrayToDescendingOrder(int[] array){

        // How to return an array to descent order?


        return new int[]{};
    }


    public static int[] getRandomArray(int len){
        int[] newArray = new int[len];
        Random random = new Random();

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = random.nextInt(101);
        }
        return newArray;
    }
}