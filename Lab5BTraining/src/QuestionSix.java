public class QuestionSix {
    public static void main(String[] args) {
        products(2, 8);
    }

    //Test	Result
    //products(2, 8);
    //40320

    public static void products(int startValue, int stopValue){
        int total = 1;
        for (int i = startValue; i <= stopValue; i++){
            total *= i;
        }
        System.out.println(total);
    }



}
