import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = createRandomArray(10);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(toDescentOrder(array)));

    }

    public static int[] createRandomArray(int len){
        Random random = new Random();
        int[] newArray = new int[len];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = random.nextInt(101);
        }
        return newArray;
    }

    public static int[] toDescentOrder(int[] array){
        int[] arrayCopy = Arrays.copyOf(array, array.length);

        int temp;
        boolean flag = true;

        while (flag){
            flag = false;
            for (int i = 0; i < arrayCopy.length - 1; i++){
                if (arrayCopy[i] < arrayCopy[i + 1]){
                    temp = arrayCopy[i + 1];
                    arrayCopy[i + 1] = arrayCopy[i];
                    arrayCopy[i] = temp;
                    flag = true;
                }
            }
        }

        return arrayCopy;
    }

}