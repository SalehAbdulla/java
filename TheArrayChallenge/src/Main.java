import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        int[] firstArraySorted = sortArray(firstArray);
        System.out.println(Arrays.toString(firstArraySorted));

    }

    public static int[] getRandomArray(int len){
        int[] newArray = new int[len];
        Random random = new Random();

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = random.nextInt(101);
        }
        return newArray;
    }

    private static int[] sortArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    System.out.println("Temps is equal to = " + temp);
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("-->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }

}