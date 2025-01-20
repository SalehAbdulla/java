public class Main {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printWeekDay(1);
    }

    public static void printDayOfWeek(int day) {

        String dayOfTheWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println("The day " + day + " is equivalent to " + dayOfTheWeek + ".");
    }

    public static void printWeekDay(int day) {
        if (day == 0){
            System.out.println("The day " + day + " is equivalent to " + "Sunday" + ".");
        } else if (day == 1){
            System.out.println("The day " + day + " is equivalent to " + "Monday" + ".");
        } else if (day == 2) {
            System.out.println("The day " + day + " is equivalent to " + "Tuesday" + ".");
        } else if (day == 3) {
            System.out.println("The day " + day + " is equivalent to " + "Wednesday" + ".");
        } else if (day == 4) {
            System.out.println("The day " + day + " is equivalent to " + "Thursday" + ".");
        } else if (day == 5) {
            System.out.println("The day " + day + " is equivalent to " + "Friday" + ".");
        } else if (day == 6) {
            System.out.println("The day " + day + " is equivalent to " + "Saturday" + ".");
        }
    }
}
