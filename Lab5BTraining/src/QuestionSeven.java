public class QuestionSeven {
    public static void main(String[] args) {
        int startValue = 5; int stopValue = 60; int step = 3;
        sumOfValues(startValue, stopValue, step);
    }

    public static void sumOfValues(int startValue, int stopValue, int stepValue){
        int total = 0;

        for (int i = startValue; i <= stopValue; i+= stepValue) {
            total += i;
        }

        System.out.println(total);
    }
}
