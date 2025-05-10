public class Lab4BQ4 {
    public static void main(String[] args) {
        getDecadeBorn(1998);
    }
    public static void getDecadeBorn(int year){
        int lastTwoDigit = year % 100;
        int decadeBorn = (lastTwoDigit / 10) + 1;
        System.out.printf("You were born in the %dth decade of the century.", decadeBorn);
    }
}
