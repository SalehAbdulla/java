public class Testing {
    public static void main(String[] args) {

//        int[] myArray = {51, 22, 23, 12, 2};
//        for (int counter = 0; counter < myArray.length; counter++) {
//            if (myArray[counter] % 3 == 0){
//                System.out.print(myArray[counter] / 3 + " ");
//            }
//        }

//        int[] myArray = { 99, -4, 66, 18, 11, 1, 43, 25, -17, -99 };
//
//        for (int i = myArray.length - 1; i >= 0; i--){
//            System.out.println(myArray[i] + " ");
//        }

        int[] myArray = { -1, 11, -3, 9 };
        int sum = 0;

        for (int i = 0; i < myArray.length; i += 2) {
            sum = sum + myArray[i];
        }

        System.out.println(sum);

    }
}
