public class SeventhQuestion {
    public static void main(String[] args) {
        sumOfValues(5, 60, 3);
    }

    public static void sumOfValues(int startValue, int stopValue, int step) {
        int result = 0;

        for (int i = startValue; i <= stopValue; i += step) {
            result += i;
        }

        System.out.println(result);
    }
}
