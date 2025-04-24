public class SumOfValues {
    public static void main(String[] args) {
        int startValue = -8; int stopValue = -5; int step = 3;
        sumOfValues(startValue, stopValue, step);
    }

    public static void sumOfValues(int startValue,int stopValue,int step) {
        int result = 0;
        for (int i = startValue; i <= stopValue; i = i + step) {
                result += i;
                System.out.println("i = " + i);
                System.out.println("result " + result);

        }
        System.out.println(result);
    }

}
