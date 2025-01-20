public class Main {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0){
            System.out.println("Something");
        } else {
            System.out.println(minutes + " min = " + (minutes / 518_400)  + " y and " + (minutes / 1440) + " d");
        }
    }
}