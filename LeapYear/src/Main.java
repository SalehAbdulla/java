public class Main{
    public static void main(String[] args) {
        System.out.println(LeapYear(2400));
    }
    public static boolean LeapYear(int year) {
        if (year >= 1 && year <= 9999){
            if (year %4 == 0) {
                if (year %100 == 0){
                    if (year %400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}